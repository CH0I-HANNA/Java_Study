package final1;

public class ConstructInit {

    final int value; //생성자를 사용해서 final 필드를 초기화 함. -> 이 경우, 각 인스턴스마다 final 필드에 다른 값을 할당할 수 있다.
    //(물론 final을 사용했기 때문에 생성 이후에 이 값을 변경하는 것은 불가능하다. 사용자로부터 아이디 값을 할당하고 변경하지 않도록 하는 경우에 사용할 수 있다.)

    public ConstructInit(int value) {
        this.value = value;
    }
}
