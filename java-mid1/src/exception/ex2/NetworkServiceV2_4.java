package exception.ex2;

public class NetworkServiceV2_4 {

    //sendError에서 새로운 에러 런타일에러가 발생시에 disconnect가 호출되지 않음을 확인하기 위한 클래스. 따라서 finally 등장
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류코드] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        //NetworkClientException이 아닌 다른 예왹 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect(); //예외 발생시 무시
    }
}
