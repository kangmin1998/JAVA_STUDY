package chap07_inheritance.com.section01.extend;

public class FireCar extends Car{
    /*
    클래스 선언부에 extends Car를 추가해서 Car 클래스를 상속 받는다.
    그러면 FireCar는 Car의 모든 멤버(필드, 메소드)를 상속 받을 수 있다.
    단, 생성자는 상속을 받지 못한다.
    또한 부모의 private 멤버는 접근이 불가능하다.
     */

    public FireCar(){
        // 모든 생성자는 맨 첫줄에 super()를 컴파일러가 자동으로 추가한다.
        // 부모의 기본 생성자를 호출하는 구문이다.
        // 명시적 or 묵시적으로 사용 가능하다.
        super();
        System.out.println("FireCar 클래스의 기본생성자 호출됨");
    }

    /*
        @Override 어노테이션
        JDK1.5부터 추가 된 문법으로 오버라이딩 성립 요선을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
        오버라이딩 하는 메소드는 기본적으로 부모 메소드의 선언 내용을 그대로 작성해야 한다.
     */
    @Override
    public  void soundHorn(){
        if(isRunning()) {
            System.out.println("빠아아앙!! 빠아아앙!!");
        }else {
            System.out.println("소방차가 앞으로 갈 수 없습니다! 비키세요~!!");
        }
    }

    // 상속은 자식 클래스가 부모의 클래스를 확장하는 것이다. 따라서 FireCar만의 추가적인 기능도 작성할 수 있다.

    public void sprayWater(){
        System.out.println("불 난 곳을 발견했습니다. 물을 뿌립니다. =======>>>");
    }

}
