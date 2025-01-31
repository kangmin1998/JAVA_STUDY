package chap06_class_and_object.com.section09.objectArray;

public class Car {

    private String modelName;
    private int maxSpeed;

    public  Car(String modelName, int maxSpeed){
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void dirveMaxSpeed() {
        System.out.println(modelName + "가(이) 최고 시속 " + maxSpeed + "km/h로 달려갑니다.");
    }
}
