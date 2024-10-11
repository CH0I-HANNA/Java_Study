package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BIgData bigdata = new BIgData();
        bigdata.data = new Data(); //이렇게 해주면 data변수에 Data클래스를 기반으로 한 객체를 생성한 수 참조값을 반환 함.
        System.out.println("bigData.count: " + bigdata.count); //count의 타입 : int -> int이므로 0.
        System.out.println("bigData.count: " + bigdata.data); //참조값이 들어있으므로 참조값 반환.
        System.out.println("bigData.count: " + bigdata.data.value); //bigData.data는 null이므로 nullPointerException 발생.

    }
}
