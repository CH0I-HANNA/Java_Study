package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(k3 -> model3)
        Mode3Car mode3Car = new Mode3Car();
        driver.setCar(mode3Car);
        driver.drive();
    }
}
