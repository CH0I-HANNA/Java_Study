package scanner;

import java.util.Scanner;

public class ScannerEx10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            System.out.print("옵션을 선택해주세요: ");
            int option = input.nextInt();

            input.nextLine();
            String name;
            int quantity;
            int eachPrice;
            int totalPrice;


            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                name = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                eachPrice = input.nextInt();

                System.out.print("상품의 수량을 입력하세요: ");
                quantity = input.nextInt();

                totalPrice = eachPrice * quantity;

                System.out.println("상품명: " + name + ", 가격: " + eachPrice + ", 수량: " + quantity + ", 합계: " + totalPrice);

                totalCost += totalPrice;

                System.out.println();
            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;

                System.out.println();
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해 주세요.");

                System.out.println();
            }
        }
    }
}
