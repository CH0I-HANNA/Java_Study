package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3; //클래스 value
    private int outInstanceValue = 2; //인스턴스 value

    static class Nested { //메서드 영역임. -> 인스턴스 접근 불가
        private int nestedInstanceValue = 1;

        public void print() {

            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
//            System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 접근 가능.
            System.out.println(NestedOuter.outClassValue); //원래 static 이므로 다른곳에서도 접근 가능하다
            System.out.println(outClassValue); //이것도 가능.
            //하지만 차이점은 private도 접근 가능하다는 것이다.
            //private 접근 제어자는 같은 클래스 안에 있을 때만 접근할 수 있다.
            //중첩 클래스도 바깐 클래스와 같은 클래스 안에 있다. 따라서 중첩 클래스는 바깥 클래스의 private 접근 제어자에 접근할 수 있다.
        }
    }
}