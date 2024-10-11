package scanner;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
