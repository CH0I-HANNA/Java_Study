package construct;

public class MethodMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 19, 98);
        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 13, 92);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("name: " + member.name + ", age: " + member.age + ", grade: " + member.grade);
        }
    }
}

//여기서 initMember()는 Member에 초기값 설정 기능을 제공하는 메서드이다.
//다음과 같이 메서드를 호출하면 객체의 멤버 변수에 인자로 넘어온 값을 채운다.
//