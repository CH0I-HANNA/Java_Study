package final1;

public class FinalFieldMain {
    //final 필드 - 생성자 초기화
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
//        constructInit1.value = 20; //컴파일 에러

        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FinalInit finalInit1 = new FinalInit();
        FinalInit finalInit2 = new FinalInit();
        FinalInit finalInit3 = new FinalInit();
        System.out.println(finalInit1.value);
        System.out.println(finalInit2.value);
        System.out.println(finalInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FinalInit.CONST_VALUE); //static final이 붙은 변수를 자바에서는 '상수'라고 한다. -> 클래스이름으로 접근 가능
    }
}
