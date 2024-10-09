package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int value1 = Integer.parseInt(str1);
        int value2 = Integer.parseInt(str2);

        int sum = value1 + value2;

        System.out.println("두 수의 합: " + sum);
    }
}
