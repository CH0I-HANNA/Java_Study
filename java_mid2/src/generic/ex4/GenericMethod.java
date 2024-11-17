package generic.ex4;

public class GenericMethod {

    public static Object objectMethod(Object obj) {
        System.out.println("object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) { //static 제네릭 메서드
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) { //타입 매개변수를 제한한 static 제네릭 메서드
        System.out.println("bound print: " + t);
        return t;
    }
}
