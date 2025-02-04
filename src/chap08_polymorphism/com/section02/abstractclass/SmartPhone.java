package chap08_polymorphism.com.section02.abstractclass;

public class SmartPhone extends Product{
    // 추상 클래스를 상속 받을 경우 추상 메소드를 반드시 오버라이딩 해야 한다.
    // 오버라이딩 강제성 부여

    @Override
    public void abstMethod() { // 오버라이드 강제화 무조건 써야한다.
        System.out.println("Product 클래스의 absMethod 를 오버라이딩 한 메소드 호출..");
    }

    // 추가적으로 매소드도 작성할 수 있다.
    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출..");
    }

}
