package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string); //java.lang.Object@7b23ec81 클래스와 참조값에 대한 정보

        // object 직접 출력
        System.out.println(object.toString());
        System.out.println(object); //string과 결과값이 같음.
    }
}


