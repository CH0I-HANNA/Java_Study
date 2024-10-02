package poly.car1;

public class Mode3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("Mode3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Mode3Car.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Mode3Car.pressAccelerator");
    }
}
