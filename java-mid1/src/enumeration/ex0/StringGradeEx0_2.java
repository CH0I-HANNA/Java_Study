package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 등급의 할인 금액 = " + vip);

        //오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("diamondd = " + diamondd);

        //소문자 입력
        int gold1 = discountService.discount("gold", price);
        System.out.println("gold1 = " + gold1);

        int basic = discountService.discount("BASIC", 10000);
        int gold = discountService.discount("GOLD", 10000);
        int diamond = discountService.discount("DIAMOND", 10000);
        System.out.println("basic 등급의 할인 금액 = " + basic);
        System.out.println("gold 등급의 할인 금액 = " + gold);
        System.out.println("diamond 등급의 할인 금액 = " + diamond);
    }
}
