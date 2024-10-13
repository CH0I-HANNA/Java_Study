package time.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 01, 01, 00, 00, 00);
        System.out.println("기준 시각: " + ldt);

        LocalDateTime plussedDateTime = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + plussedDateTime);
    }
}