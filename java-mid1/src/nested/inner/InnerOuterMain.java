package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter innerOuter = new InnerOuter();
        InnerOuter.Inner inner = innerOuter.new Inner();
        //내부 클래스는 바깥 클래스의 인스턴스에 소속된다.
        //따라서 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있다.

        //내부 클래스는 바깥 클래스의 인스턴스에 소속되어야 한다.
        //따라서 내부 클래스를 생성할 떄, 바깥 클래스의 인스턴스 참조가 필요하다.

        //내부 클래스는 개념상 바깥 클래스의 인스턴스 내부에 생성된다.
        //따라서 내부 인스턴스는 바깐 인스턴스를 알기 때문에 바깥 인스턴스의 멤버에 접근할 수 있다.
        //따라서 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다.

        //실제로 내부 인스턴스가 바깥 인스턴스 안에 생서오디는 것은 아니다. 하지만 개념상 인스턴스 안에 생성된다고 이해하면 충분하다.
        //실제로는 내부 인스턴스는 바깥 인스턴스의 참조를 보관한다. 이 참조를 통해 바깥 인스턴스의 멤버에 접근할 수 있다.

        inner.print();
    }
}
