package scanner;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫번쨰 숫자를 입력하세요: ");
        int num1 = input.nextInt();

        System.out.print("두번쨰 숫자를 입력하세요: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        while (num1 < num2) {
            System.out.print(num1 + ",");
            num1++;
        }
        System.out.print(num2);
    }
}
