package array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int studentCount = input.nextInt();
        int[][] scores = new int[studentCount][3];

        String[] subjects = {"국어", "수학", "영어"};
        int total;
        double average;

        for (int row = 0; row < scores.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int col = 0; col < scores[row].length; col++) {
                System.out.print(subjects[col] + " 점수: ");
                scores[row][col] = input.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            average = (double) total / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);

        }
    }
}
