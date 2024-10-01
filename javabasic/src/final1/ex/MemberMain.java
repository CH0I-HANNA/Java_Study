package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member1 = new Member("hannachoe53", "최한나");
        Member member2 = new Member("mids03", "최원삼");
        Member member1 = new Member("1234567", "최한나");
        Member member2 = new Member("12345679", "최둘셋");

        Member.print(member1);
        Member.print(member2);
        //changeData 사용
    }
}
