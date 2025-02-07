package chap12_exception.com.section01.exception;

public class Application1{
    public static void main(String[] args) throws Exception {

        /* [ 예외를 발생시키는 구문 ] */
        /*
            - throw new 예외클래스명();
            예외 처리 방법
            1. throws로 위임
            2. try-catch로 처리
         */

        ExceptionTest et = new ExceptionTest();
        // 예외가 발생하면 예외 발생 구문 이하는 구문이 동작하지 않는다.
        et.checkEnoughMoney(10000, 50000); // throws 받았으니 예외처리 해야한다.
        System.out.println("프로그램을 종료합니다.");

    }
}
