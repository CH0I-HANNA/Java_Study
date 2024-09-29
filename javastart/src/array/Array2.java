package array;

public class Array2 {

    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 91;
        students[2] = 92;
        students[3] = 93;
        students[4] = 94;

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

    }
}
