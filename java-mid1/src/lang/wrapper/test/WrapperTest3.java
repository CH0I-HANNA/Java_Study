package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        //박싱
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //언박싱
        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        //박싱
        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);


    }
}