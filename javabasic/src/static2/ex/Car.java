package static2.ex;

public class Car {
    private String name;
    private static int count = 0;   //static 변수를 사용. -> 클래스로 접근 가능

    public Car(String name) {
        this.name = name;
        count++;
        System.out.println("차량 구입, 이름: " + this.name);
    }

    public static void showTotalCars()
    {
        System.out.println("구매한 차량 수: " + count);
    }
}
