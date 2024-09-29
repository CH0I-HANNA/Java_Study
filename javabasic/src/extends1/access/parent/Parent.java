package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() { //자기 건 자기거를 다 호출 할 수 있음.
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        //부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();

    }
}

/*
private : 모든 외부 호출을 막음.
default : 같은 패키지 내에서만 호출 가능.
protected : 같은 패키지 내에서 호출 가능. 그리고 다른 패키지라 하더라도 상속 관계의 호출을 허용한다.
만약 상위 클래스의 매서드가 protected로 선언되어 있으면 하위 클래스에서 이를 public 또는 protected로 오버라이드할 수 있지만. private 또는 default로 오버라이드 할 수 없다.
오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안 된다.
public : 모든 외부 호출을 할 수 있음.
*/
