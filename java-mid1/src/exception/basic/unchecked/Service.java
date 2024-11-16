package exception.basic.unchecked;

public class Service {

    Client client = new Client();

    public void callCatch() {

        try {
            client.call();
        } catch (RuntimeException e) {
            System.out.println("예외 처리, nessage=" + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    public void callThrow() {
        client.call();
    }
}
