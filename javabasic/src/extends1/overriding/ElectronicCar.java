package extends1.overriding;

public class  ElectronicCar extends Car {

    @Override //없어도 되긴 함. 하지만 쓰는 것이 좋음.
    public void move() {
        System.out.println("전기차를 빠르게 움직입니다.");
    }

    public void charge() {
        System.out.println("차를 충전합니다.");
    }
}
