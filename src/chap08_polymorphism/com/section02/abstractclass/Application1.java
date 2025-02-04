package chap08_polymorphism.com.section02.abstractclass;

public class Application1 {
    public static void main(String[] args) {
        /* [ 추상 클래스와 추상 메소드 ] */

        // 추상 클래스는 인스턴스 생성불가
        // Product product = new Product();

        // 추상 클래스를 상속 받는 객체를 이용한다.
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof  SmartPhone);
        System.out.println(smartPhone instanceof Product);

        // 다향성을 적용해 추상 클래스를 레퍼런스 타입으로 활용할 수 있다.
        Product product = new SmartPhone();

        // 동적 바인딩에 의해 SmartPhone 의 메소드가 호출 된다.
        product.abstMethod();

        // 추상 클래스가 가지고 있는 메소드도 호출할 수 있다.
        product.nonStaticMethod();
        Product.staticMethod();

        // 추상 클래스를 사용하는 이유?
        // 추상 클래스의 추상 메소드는 오버라이딩에 대한 강제성이 부여 된다.
        // 따라서 여러 클래스들을 그룹화하여 필수 기능을 정의하여 강제성을 부여해
        // 개발 시 일관 된 인터페이스를 제공할 수 있다.
    }
}
