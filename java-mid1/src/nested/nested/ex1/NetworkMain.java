package nested.nested.ex1;

public class NetworkMain {

    public static void main(String[] args) {
        Network network = new Network(); //Network를 생성하고 network.sendMessage()를 통해 메시지를 전달한다.
        network.sendMessage("hello java");
    }
}
//NetworkMain은 오직 Network클래스만 사용한다. NetworkMessage클래스는 전혀 사용하지 않는다.
//NetworkMessage는 오직 Network내부에서만 사용된다.
