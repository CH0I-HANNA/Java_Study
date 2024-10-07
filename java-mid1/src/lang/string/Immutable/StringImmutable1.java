package lang.string.Immutable;

public class StringImmutable1 {

    public static void main(String[] args) {

        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str); //합쳐지지 않음. 왜냐하면 str은 불변객체이기 때문이다.
    }
}
