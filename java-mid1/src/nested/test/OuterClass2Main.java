package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        //내부 클래스는 바깥 클래스의 인스턴스에 소속되므로 바깥 클래스의 인스턴스 참조가 필요함.
        OuterClass2 outerClass2 = new OuterClass2(); //바깥 클래스의 인스턴스 생성.
        OuterClass2.InnerClass innerClass = outerClass2.new InnerClass(); //바깥 클래스의 인스턴스 참조. -> 참조하여서 내부 클래스의 인스턴스 생성.
        innerClass.hello();
    }
}
