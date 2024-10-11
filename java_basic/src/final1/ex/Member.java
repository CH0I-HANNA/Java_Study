package final1.ex;
//고객의 id를 변경하면 큰 문제가 생긴다. 이때 final로 선언하고 생성자로 값을 할당하면 된다.
public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id = id; //id는 final이므로 컴파일 오류 발생
        this.name = name;
    }

    public static void print(Member member) { //static 으로 하는 것이 더 좋을 것 같아 static추가함
        System.out.println("id: " + member.id + ", name: " + member.name);
    }
}
