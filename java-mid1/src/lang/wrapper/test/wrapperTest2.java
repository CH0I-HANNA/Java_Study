package lang.wrapper.test;

public class wrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        
        double value;
        double sum = 0;
        for (String s : array) {
            value = Double.parseDouble(s);
            sum += value;
        }
        System.out.println("sum = " + sum);
    }
}
