package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        obj.add(100); //return 값을 버린 것임.

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println(obj.getValue());
    }
}
