package method;

public class Method1 {

    public static void main(String[] args) {
        int sum1 = add(5,10);
        System.out.println("결");

    }
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산수행");
        int sum = a + b;
        return sum;
    }
}
