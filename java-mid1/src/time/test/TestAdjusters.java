package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
         int year = 2024;
         int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek(); //1일의 요일을 반환
        DayOfWeek lastDayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek(); //TemporalAdjusters클래스를 사용.

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
