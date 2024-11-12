package nested.test;

public class OuterClass2 {
    //문제2 - 내부 클래스를 완성해라
    class InnerClass { //내부 클래스는 class 앞에 static이 붙지 않는다.
        public void hello() {
            System.out.println("InnerClass.hello");
        }
    }
}
