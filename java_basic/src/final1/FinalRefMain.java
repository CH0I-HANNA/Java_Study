package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();   //-> 참조값 변경 불가능
//    data =new Data;//-> 컴파일 에러. 하지만 참조값에 있는 값들은 final이 아니기에 변경 가능(참조 대상의 값은 변경 가능)
        data.value  = 10;
        System.out.println(data.value);
        data.value  = 20;
        System.out.println(data.value);
    }
}
