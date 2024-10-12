package time;

import java.time.LocalDate;

public class LocalDataMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 = " + nowDate);
        LocalDate ofDate = LocalDate.of(2025, 4, 7);
        System.out.println("지정날짜 = " + ofDate);

        //계산(불변)
        //모든 날짜 클래스는 불변이다. 따라서 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야 한다.
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + plusDays);
    }
}
