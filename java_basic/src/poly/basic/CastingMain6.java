package poly.basic;

//instanceof
//다형성에서 참조형 변수는 이름 그대로 다양한 자식을 대상으로 참조할 수 있다.
// 그런데 참조하는 대상이 다양하기 때문에 어떤 인스턴스를 참조하고 있는지 확인하려면 어떻게 해야할까?
public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();  //자신과 같은 Parent의 인스턴스를 참조
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();   //자식 타입인 Child의 인스턴스를 참조
        System.out.println("parent2 호출");//이때 parent1, parent2변수가 참조하는 인스턴스의 타입을 확인하고 싶다면 instanceof키워드를 사용하면 된다.
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) { //Child 인스턴스가 맞다면 실행
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
