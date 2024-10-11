package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; //첫번째 학생의 정보를 담을 수 있는 변수를 설정.(Student 타입의 변수 student1 선언.)
        student1 = new Student(); //메모리에 학생이라는 데이터를 만들어서 사용할 수 있도록 함.(
        student1.name = "학생1"; //.을 통해서 접근할 수 있음.
        student1.age = 19;
        student1.grade = 90;

        Student student2 = new Student(); //(student1과 다른)또 다른 변수를 설정.
        student2.name = "학생2";
        student2.age = 11;
        student2.grade = 99;

        System.out.println("name:" + student1.name + " age:" + student1.age + " grade:" + student1.grade);
        System.out.println("name:" + student2.name + " age:" + student2.age + " grade:" + student2.grade);

    }
}

//---------------------<클래스와 사용자 정의 타입>-----------------------
//학생(Student)이라는 타입을 만들면 되지 않을까? -> 클래스를 사용하면 int, String과 같은 타입을 만들 수 있음.
//사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스이다.
//설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
//---------------------------용어 정리-------------------------------
//클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다. 둘다 같은 의미로 사용한다.
//여기서는 학생(Student)라는 클래스(설계도)를 기반으로 학생1(student1), 학생2(student2) 객체를 만들었다.
//-------------------------객체 생성 로직-----------------------------
//student1 = new Student(); (코드분석)
//객체를 사용하려면 먼저 설계도인 클래스를 기반으로 객체를 생성해야 한다.(객체 생성 후 -> 객체 사용 가능)
//new Student() 에서 new는 새로 생성한다는 뜻이다. new Student()는 Student클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다.
//이렇게 하면 메모리에 실제 Student 객체를 생성한다.
//객체를 생성할 때는 new 클래스명()을 사용하면 된다.
//Student 클래스는 String name, int age int grade 멤버 변수를 가지고 있다. 이 변수를 사용하는데 필요한 메모리 공간도 함께 확보한다.
//--------------------------참조값 보관-------------------------------
//student1 = new Student() -> Student라는 클래스를 기반으로한 객체 생성. -> 참조값(주소)를 반환해서 student1이라는 변수에 저장. -> student1 = x001;
//이 변수를 통해서 객체를 접근(참ㅁ조)할 수 있다. 쉽게 이야히해서 student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용할 수 있다.
//참조값을 변수에 보관해야 하는 이유:객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다.
//이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다.
//따라서 생성한 객체에 접근할 수 있는 방법이 필요하다. 이런 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 한다.
//앞서 Student student1 변수에 참조값(x001(을 저장해두었으므로 저장한 참조값을 통해서 실제 메모리에 존재하는 객체에 접근할 수 있다.