package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period betweenPeriod = Period.between(startDate, endDate);
        long betweenDays = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + betweenPeriod.getYears() + "년 " + betweenPeriod.getMonths() + "개월 " + betweenPeriod.getDays() + "일");
        System.out.println("디데이: " + betweenDays + "일 남음");
    }
}
