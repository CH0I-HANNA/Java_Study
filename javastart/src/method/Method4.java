package method;

import java.util.Scanner;

public class Method4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("나이를 입력해주세요:");
        int age = input.nextInt();
        checkAge(age);
    }

    public  static void checkAge(int a) {
        if (a >= 18) {
            System.out.println("입장하세요.");
        } else {
            System.out.println("미성년자는 출입이 불가합니다.");
        }
        return;
    }
}
