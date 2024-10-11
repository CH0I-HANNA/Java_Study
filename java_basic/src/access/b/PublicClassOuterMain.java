package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //DefaultClass 호출 불가능 (다른 패키지 접근 불가)
    }
}
