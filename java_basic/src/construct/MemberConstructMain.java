package construct;

public class MemberConstructMain {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 19, 39);
        MemberConstruct member2 = new MemberConstruct("user2", 22, 99);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("name: " + member.name + ", age: " + member.age + ", grade: " + member.grade);
        }
    }

}
