package chap12_exception.com.section02.userException.exception;

public class MoneyNegativeException extends NegativeException {

    public MoneyNegativeException(String message) {
        super(message);
    }
}
