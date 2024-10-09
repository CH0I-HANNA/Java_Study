package lang.math;

import java.util.Random;

public class RandonMain {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double rendomDouble = random.nextDouble();
        System.out.println("rendomDouble = " + rendomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10);
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("0 ~ 10: " + randomRange2);
    }
}
