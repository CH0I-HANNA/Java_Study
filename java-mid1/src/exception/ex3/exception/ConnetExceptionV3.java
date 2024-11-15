package exception.ex3.exception;

public class ConnetExceptionV3 extends NetworkClientExceptionV3 {

    private final String address;

    public ConnetExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
