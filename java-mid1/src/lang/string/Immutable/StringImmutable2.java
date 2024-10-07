package lang.string.Immutable;

public class StringImmutable2 {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java");
        //String은 불변객체이다. 따라서 변경이 필요한 경우 기존 값을 변경하지 않고, 대신에 새로운 결과를 만들어서 반환한다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        //String.concat()은 내부에서 새로운 String 객체를 만들어서 반환한다.
        //따라서 불변과 기존 객체의 값을 유지한다.
    }
}
