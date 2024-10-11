package static2;

public class DecoData {


    private int instanceValue;  //인스턴스 멤버 변수
    private static int staticValue; //클래스 멤버 변수

    public static void staticCall() {
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
//         instanceValue++; 인스턴스 변수 접근, 컴파일 에러
//        instanceMethod(); 인스턴스 메서드 접근, 컴파일 에러

    }

    public void instanceCall() {
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
        instanceValue++;
        instanceMethod();
    }

    public void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);

    }

    public static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
