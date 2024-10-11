package final1;

public class FinalInit {

    static final int CONST_VALUE = 10; //final 중에서도 static을 사용하여 메모리 낭비를 줄임.
    final int value = 10; //field에서 초기화함. 이 경우 모든 인스턴스가 같은 값으로 계속해서 생성될것임.
    //그러면 모든 인스턴스가 같은 값을 사용하기 떄문에 결과적으로 메모리를 낭비하게 된다. -> 이럴 떄 사용하면 좋은 것이 바로 static영역이다.(!!!!!!중요!!!!!!!)

}
