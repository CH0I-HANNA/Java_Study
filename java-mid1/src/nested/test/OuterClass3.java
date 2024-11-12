package nested.test;

public class OuterClass3 {
    public void myMethod() {
        //문제3 - 지역 클래스를 완성해라
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
