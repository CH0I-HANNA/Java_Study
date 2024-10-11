package array;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;
        int option;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            option = input.nextInt();
            input.nextLine();//개행 처리

            if (option == 1) {
                int i = 0;

                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = input.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = input.nextInt();
                productCount++;

            } else if (option == 2) {
                for (int k = 0; k < productCount; k++) {
                    System.out.println(productNames[k] + ": " + productPrices[k] + "원");
                }
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
