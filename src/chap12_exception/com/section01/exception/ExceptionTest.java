package chap12_exception.com.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws  Exception{
        // throws는 checkEnoughMoney() 함수 사용한 곳에서 예외처리 해야한다.
        System.out.println("가지고 계신 돈은 " + money + " 입니다.");

        // 예외가 발생하면 하단 코드는 호출 안함
        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        }else {
            throw new Exception();
        }
        System.out.println("즐거운 쇼핑 되세요.");
    }
}
