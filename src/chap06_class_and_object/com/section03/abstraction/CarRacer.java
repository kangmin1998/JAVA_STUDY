package chap06_class_and_object.com.section03.abstraction;

public class CarRacer {

    private Car car = new Car(); //걍 새로운 객체를 만들고 여기서만 쓰겠다 이런거 아닌가??????????

    public  void Startcar() {
        car.startCar();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }
}
