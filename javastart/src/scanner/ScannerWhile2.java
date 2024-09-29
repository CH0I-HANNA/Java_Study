package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로긔램을 종료합니다.");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 숫자의 합: " + sum);
            if (num1 > num2) {
                System.out.println("더 큰 숫자: " + num1);
                System.out.println((num1 - num2) + "만큼 더 큽니다.");
            } else if (num1 < num2) {
                System.out.println("더 큰 숫자: " + num2);
                System.out.println((num2 - num1) + "만큼 더 큽니다.");
            } else {
                System.out.println("두 숫자는 같습니다.");
            }
            System.out.println();
        }

    }
}
