package chap12_exception.com.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        /* [ try-catch 블럭을 이용한 방법 ] */

        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(1000000, 50000);
            System.out.println("====== 상품 구입 가능 ======");

        } catch (Exception e) { // try를 실행 했는데 예외가 발생하면 catch블럭을 불러온다.
            //throw new RuntimeException(e);
            // 위의 메소드 호출시 예외가 발생하는 경우 catch블럭의 코드를 실행한다.
            // 이 때 예외가 발생한 위치의 하단 코드는 동작하지 않는다.
            System.out.println("====== 상품 구입 불가 ======");

        }
        System.out.println("프로그램을 종료합니다.");
    }
}
