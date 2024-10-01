package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = input.nextInt();
        input.nextLine();
        System.out.println();

        ProductOrder[] orders = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            orders[i] = new ProductOrder();
            orders[i].productName = input.nextLine();

            System.out.print("가격: ");
            orders[i].price = input.nextInt();
            input.nextLine();

            System.out.print("수량: ");
            orders[i].quantity = input.nextInt();
            input.nextLine();
        }
//        주문 배열 출력
        printOrders(orders);
//        총 결제 금액 출력
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상풍명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}