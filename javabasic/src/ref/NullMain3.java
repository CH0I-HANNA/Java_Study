package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BIgData bigdata = new BIgData();
        System.out.println("bigData.count: " + bigdata.count); //count의 타입 : int -> int이므로 0.
        System.out.println("bigData.count: " + bigdata.data); //data의 타입 : Data 클래스 -> 참조형이므로 null.
        System.out.println("bigData.count: " + bigdata.data.value); //bigData.data는 null이므로 nullPointerException 발생.

    }
}
