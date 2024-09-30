package level_0.코딩_기초_트레이닝;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            int num = (int)b;
            if (65 <= num && num <= 90) {
                num += 32;
            } else if (97 <= num && num <= 122) {
                num -= 32;
            }
            char c = (char)num;
            System.out.print(c);
        }

    }
}