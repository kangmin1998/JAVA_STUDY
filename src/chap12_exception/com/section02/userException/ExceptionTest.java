package chap12_exception.com.section02.userException;

import chap12_exception.com.section02.userException.exception.MoneyNegativeException;
import chap12_exception.com.section02.userException.exception.NotEnoughMoneyException;

import java.awt.print.PrinterAbortException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws PrinterAbortException, NotEnoughMoneyException, MoneyNegativeException {
        if (price < 0) {
            throw new PrinterAbortException("상품 가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌈니다.");

        }

        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요~");
    }
}
