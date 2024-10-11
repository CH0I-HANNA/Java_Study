package class1;

public class ClassStart1 {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);

        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAge = {19, 18, 17};
        int[] studentGrade = {100, 90, 80};

        for (int i = 0; i < studentAge.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAge[i] + " 성적:" + studentGrade[i]);
        }
    }
}
//한 학생의 데이터가 3개의 배열에 나누어져 있기 때문에 한생 한명의 데이터를 관리할떄 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 한다.
//3개의 배열을 각각 변경행야하므로 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높다.
//이 코드는 컴퓨터가 볼 때는 아무 문제가 없지만, 사람이 관리하기에는 좋은 코드가 아니다.
//지금처럼 이름, 나이, 성적을 각각 따로 나누어서 관리하는 것은 사람이 관리하기 좋은 방식이 아니다.
//사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것이다. 그리고 각각의 학생 별로 본인의 이름, 나이, 성적을 관리하는 것이다.
//컴퓨터 입장에서는 굉장히 좋은 아니, 상관이 없다. 사람은 학생이라는 개념을 하나로 묶는 것을 좋아함.


