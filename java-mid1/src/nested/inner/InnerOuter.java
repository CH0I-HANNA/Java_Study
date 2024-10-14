package nested.inner;

public class InnerOuter {

    private static int outerClassValue = 3;
    private int outerInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            //자신의 멤버에 접근
            System.out.println(innerInstanceValue);

            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능 -> 같은 클래스 안에 있기 때문(중첩클래스이기 때문)
            System.out.println(outerInstanceValue);
            //외부 클래스의 클래스 멤버에는 접근 가능, private도 접근 가능
            System.out.println(outerClassValue);
        }
    }
}
