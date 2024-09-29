package method;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int balance = 50000;
        int dipositAmount;
        int withdrawAmount;

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("메뉴를 선택하세요: ");
            option = input.nextInt();
            if (option == 1) {
                System.out.print("입금액을 입력하세요: ");
                dipositAmount = input.nextInt();
                balance = diposit(balance, dipositAmount);
            } else if (option == 2) {
                System.out.print("출금액을 입력하세요: ");
                withdrawAmount = input.nextInt();
                balance = withdraw(balance, withdrawAmount);
            } else if (option == 3) {
                System.out.println("현재잔액: " + balance + "원");
            } else if (option == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 메뉴를 선택하세요.");
            }
        }
    }

    public static int diposit(int balance, int a) {
        balance += a;
        System.out.println(a + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;

    }

    public static int withdraw(int balance, int a) {
        if (balance >= a) {
            balance -= a;
            System.out.println(a + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(a + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
