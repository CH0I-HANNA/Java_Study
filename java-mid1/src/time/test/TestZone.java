package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        LocalDateTime seoulDateTime = LocalDateTime.of(2024, 1, 1, 9, 00, 00);
        ZonedDateTime seoulZone = ZonedDateTime.of(seoulDateTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonZone = seoulZone.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newYorkZone = seoulZone.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seoulZone);
        System.out.println("런던의 회의 시간: " + londonZone);
        System.out.println("뉴욕의 회의 시간: " + newYorkZone);
    }
}
