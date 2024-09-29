package extends1.super2;

//상속 관계를 사용하면 자식의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다.
public class ClassA {

    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}
