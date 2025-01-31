package chap06_class_and_object.com.section09.objectArray;

public class Application {
    public static void main(String[] args) {

        /* [ 객체를 클래스 배열로 관리 ] */
        // 동일 타입의 인스턴스를 여러 개 사용해야 할 때 객체 배열을 이용하면 보다 효율적으로 사용이 가능하다.
        Car[] carArray = new Car[5];
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 400);
        carArray[3] = new Car("부가티베이론", 300);
        carArray[4] = new Car("포터", 300);

        for (int i = 0; i < carArray.length; i++) {
            carArray[i].dirveMaxSpeed();
        }
        System.out.println("=================================");

        /* [ 객체 배열도 할당과 동시에 초기화 할 수 있다. ] */
        Car[] carArrays = {
                new Car("페라리", 300),
                new Car("람보르기니", 350),
                new Car("롤스로이스", 400),
                new Car("부가티베이론", 300),
                new Car("포터", 300)
        };

        for(Car car : carArrays) {
            car.dirveMaxSpeed();
        }

    }
}
