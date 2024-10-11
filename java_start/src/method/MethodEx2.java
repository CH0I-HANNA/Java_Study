package method;

public class MethodEx2 {

    public static void main(String[] args) {
        repeatPrint("Hello, world!", 4);
    }

    public static void repeatPrint(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
