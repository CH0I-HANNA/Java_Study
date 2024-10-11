package scanner;

import java.util.Scanner; //자바가 제공하는 라이브러리 사용.

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();
        System.out.println("입력하신 문자열 : " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("입력하신 정수 : " + intValue);

        System.out.println("실수를 입력하세요: ");

    }
}
