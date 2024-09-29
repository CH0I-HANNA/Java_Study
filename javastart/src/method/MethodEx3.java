package method;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;
        balance = diposit(1000, balance);
        balance = withdraw(12000, balance);

    }

    public static int diposit(int d, int balance) {
        int afterBalance = balance + d;
        System.out.println(d + "원을 입급하였습니다. 현재 잔액: " + afterBalance);
        return afterBalance;
    }

    public static int withdraw(int w, int balance) {
        int afterBalance = balance;
        if (w <= balance) {
            afterBalance = balance - w;
            System.out.println(w + "원을 출금하였습니다. 현재 잔액: " + afterBalance);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        return afterBalance;
    }
}
