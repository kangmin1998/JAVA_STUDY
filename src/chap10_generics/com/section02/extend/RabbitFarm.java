package chap10_generics.com.section02.extend;

// 제네릭 사용!!
// Rabbit을 상속 받는 타입만 가능하도록 제한을 준다.
public class RabbitFarm<T extends Rabbit> { // 토끼만 상속 받는 타입만 가능!

    // 타입 변수는 Rabbit , Bunny , DrunkenBunny 만 사용가능
    private T animal;

    public RabbitFarm() {
        // 기본 생성자
    }

    public RabbitFarm(T animal) {
        //매개변수 있는 생성자
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal(){
        return this.animal;
    }
}
