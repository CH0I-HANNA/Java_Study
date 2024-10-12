package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 = " + nowTime);
        LocalTime ofTime = LocalTime.of(12, 8, 30);
        System.out.println("지정 시간 = " + ofTime);

        //계산(불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(60);
        System.out.println("지정 시간+30s = " + ofTimePlus);
    }
}
