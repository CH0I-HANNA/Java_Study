import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        int min;
        int max;
        int i = 0;
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("test");

        min = arr[i];
        max = arr[i];

        for (i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}