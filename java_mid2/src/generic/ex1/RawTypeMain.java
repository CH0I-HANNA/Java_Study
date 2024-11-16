package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); //raw type(원시 타입)
//        GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get(); //캐스팅을 해주어야함 -> 캐스팅을 잘못하면 오류발생.(타입 안정성X)
        System.out.println("result = " + result);
    }
}
