package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim): " + "'" + strWithSpaces.trim() + "'");
        //trim()은 단순 whitespace만 제거할 수 있다.
        //strip()은 whitespace와 유니코드 고액을 포함해서 제거한다.
        System.out.println("공백 제거(strip): " + "'" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백 제거(strip): " + "'" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): " + "'" + strWithSpaces.stripTrailing() + "'");

    }
}
