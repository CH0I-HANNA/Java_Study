package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        class LocalPrinter { //지역 클래스(괄호 안에 있음)
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar); //이것도 지역변수다.
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
