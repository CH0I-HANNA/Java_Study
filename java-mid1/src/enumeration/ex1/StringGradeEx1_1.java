package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {

    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex0.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, 10000);
        int gold = discountService.discount(StringGrade.GOLD, 10000);
        int diamond = discountService.discount(StringGrade.DIAMOND, 10000);
        System.out.println("basic 등급의 할인 금액= " + basic);
        System.out.println("gold 등급의 할인 금액 = " + gold);
        System.out.println("diamond 등급의 할인 금액 = " + diamond);
    }
}