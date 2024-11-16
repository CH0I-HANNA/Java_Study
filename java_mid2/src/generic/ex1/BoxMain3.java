package generic.ex1;

public class BoxMain3 {

    //제네릭을 사용한 덕분에 코드 재사용과 타입 안정성이라는 두 마리 토끼를 모두 잡을 있었다.
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입이 결정됨
        integerBox.set(10); //실수로 문자를 넣어도 컴파일 단계에서 막아줌. -> 타입 안전성 O
        Integer integer = integerBox.get(); //캐스팅을 따로 해주지 않아도 됨.
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>(); //타입 추론 -> 타입을 직접 입력하지 않아도 된다.
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        //원하는 모든 타입이 사용가능하다.
        new GenericBox<Double>();
        new GenericBox<Boolean>();
        new GenericBox<>(); //자기가 만든 클래스를 넣어도 됨. ex)MyClass
    }
}
