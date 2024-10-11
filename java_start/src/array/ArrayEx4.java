package array;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");

        int num = input.nextInt();

        int[] numbers;
        numbers = new int[num];
        int sum = 0;
        double average;

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / num;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
