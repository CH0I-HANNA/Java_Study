package nested.test;

public class OuterClassMain {

    public static void main(String[] args) {

        //정적 중첩 클래스는 바깥 클래스와 아무 관계가 없는 클래스이므로 바깥 클래스의 인스턴스가 필요없음.
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();

    }

}
