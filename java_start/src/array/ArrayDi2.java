package array;

public class ArrayDi2 {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3,7,4},
                {4, 5, 6,6,3}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
