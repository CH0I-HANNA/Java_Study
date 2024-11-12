package nested.test;

public class OuterClass1 {
    //문제1 - 정적 중첩 클래스를 완성해라
    static class NestedClass { //정적 중첩 클래스는 class 앞에 static이 붙는다.

        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
