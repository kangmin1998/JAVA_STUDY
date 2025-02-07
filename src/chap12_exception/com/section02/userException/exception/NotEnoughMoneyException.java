package chap12_exception.com.section02.userException.exception;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException() {
    }

    // 문자열을 부모 생성자쪽으로 전달하며 초기화 하는 생성자
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
