package chap10_generics.com.section02.extend.run;

import chap10_generics.com.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        // extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다.

        // extends 키워드로 Rabbit 의 상위 타입이거나 관련 없는 타입을 통해서는 인스턴스 생성이 불가
        // RabbitFarm<Animal> farm1 = new RabbitFarm<>();
        // RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
        // RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        // Rabbit 후손만 사용가능!
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        // 새로운 객체 생성 RabbitFarm -> farm1 토끼 타입을 가진다.

        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        // farm1.setAnimal(new Animal()); // Rabbit , Bunny , DrunkenBunny 만 사용가능

        // Rabbit rabbit = new Rabbit();
        // farm1.setAnimal(rabbit);

        farm1.setAnimal(new Rabbit()); // 위 코드 두 단계를 1단계로 표현



        // Rabbit r = farm1.getAnimal();
        // r.cry();
        farm1.getAnimal().cry();
        farm1.getAnimal().aaa();

        farm2.setAnimal(new Bunny());
        farm2.getAnimal().cry();

        farm3.setAnimal(new DrunkenBunny());
        farm3.getAnimal().cry();

    }
}
