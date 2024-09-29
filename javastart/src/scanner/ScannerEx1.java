package scanner;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = input.nextLine();
        System.out.print("나이를 입력하세요: ");
        String age = input.nextLine();

        System.out.println("당신의 나이는 " + name + "이고, 나이는 " + age + "살 입니다.");
    }
}
