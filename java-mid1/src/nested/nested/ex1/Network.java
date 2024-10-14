package nested.nested.ex1;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}

//text를 입력 받아서 NetworkMessage를 생성하고 출력하는 단순한 기능을 제공한다.