package array;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = input.nextInt();

        int[] numbers = new int[num];
        int maxNum;
        int minNum;

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        minNum = maxNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (maxNum < numbers[i]) {
                maxNum = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (minNum > numbers[i]) {
                minNum = numbers[i];
            }
        }

        System.out.println("가장 작은 수: " + minNum);
        System.out.println("가장 큰 수: " + maxNum);
    }
}
