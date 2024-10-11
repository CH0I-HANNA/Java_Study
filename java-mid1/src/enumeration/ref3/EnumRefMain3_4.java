package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class EnumRefMain3_4 {

    public static void main(String[] args) {
        int price = 10000;

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
        //VIP 등급을 추가하더라도 코드 수정없이 할인 금액 출력 가능
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
