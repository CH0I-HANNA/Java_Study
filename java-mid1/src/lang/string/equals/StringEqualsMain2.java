package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2)); //false 반환

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4)); //true 반환
    }

    private static boolean isSame(String x, String y) {
        //return x == y; //동일성비교 X
        return x.equals(y); //동등성비교를 해야한다.
    }

}
