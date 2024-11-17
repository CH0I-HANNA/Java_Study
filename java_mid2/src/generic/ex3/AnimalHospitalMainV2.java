package generic.ex3;


import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}

//제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
//따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 object로 가정하고, object의 기능만 사용할 수 있다.

//이는 타입 매개변수를 animal로 제한하지 않았기 때문에 발생함. 타입 인자가 모두 animal과 그 자식만 들어올 수 있게 제한하면 된다.
