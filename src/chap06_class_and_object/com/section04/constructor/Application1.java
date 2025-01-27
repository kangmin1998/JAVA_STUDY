package chap06_class_and_object.com.section04.constructor;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        // 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다.

        /*
            1. 기본 생성자 호출
         */
        User user = new User();
        // 위드 코드는 아래 코드를 읽어온다.
        // public  User(){  // 컴파일러가 기본생성자로 암묵적으로 자동생성을 했다.
        // System.out.println("User 클래스의 기본 생성자 호출함...");
        // }
        System.out.println(user.getInformation());

        /*
            2. 매개변수 생성자 호출
         */
        User user1 = new User("User01", "1234", "강태민");
        System.out.println(user1.getInformation());

        /*
            3. 모든 필드를 초기화 하는 매개변수 생성자 호출
            import java.util.Date 클래스의 기본 생성자를 통해 객체를 생성하면
            현재 프로그램이 동작하는 운영체제 상의 날짜/시간/정보를 이용해 인스턴스가 생성된다.
         */
        User user2 = new User("User2", "1234", "강태민", new Date());
        System.out.println(user2.getInformation());
    }
}
