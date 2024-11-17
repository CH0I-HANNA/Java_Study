package generic.ex5;

public class EraserBox {

    public boolean instancecheck(Object param) {
//        return param instanceof T;
        //T는 런타임에 모두 Object가 되어버린다.
        //instanceof는 항상 Object와 비교하게 된다.
        //이렇게 되면 항상 참이 반환되는 문제가 발생한다.
        //자바는 이런 문제 떄문에 타입 매개변수에 instanceof를 허용하지 않는다.
        return true;
    }

    public void create() {
//        return new Object();
        //new T는 항상 new Object가 되어버린다. 개발자가 의도한 것과는 다르다.
        //따라서 자바는 타입 매개변수에 new를 허용하지 않는다.
    }
}
