package method;

public class Method3 {

    public static void main(String[] args) {
        System.out.println(odd(2));
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
