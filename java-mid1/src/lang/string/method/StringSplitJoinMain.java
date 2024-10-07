package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] splitStr = str.split(",");
        for (String string : splitStr) {
            System.out.println(string);
        }

        //join()
        String joinStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinStr);

        //문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }

}
