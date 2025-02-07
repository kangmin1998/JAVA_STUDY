package chap12_exception.com.section02.userException;

import chap12_exception.com.section02.userException.exception.MoneyNegativeException;
import chap12_exception.com.section02.userException.exception.NotEnoughMoneyException;

import java.awt.print.PrinterAbortException;

public class Application1 {
    public static void main(String[] args) {
        /* [ 사용자 정의 예외 클래스 ] */
        /*
            사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다.
         */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(-50000, 70000);
        } catch (PrinterAbortException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            e.printStackTrace(); //예외가 발생 출력에 빨간줄 표시
        } catch (NotEnoughMoneyException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(); //예외가 발생 출력에 빨간줄 표시
        } catch (MoneyNegativeException e) {
            //throw new RuntimeException(e);
            e.printStackTrace(); //예외가 발생 출력에 빨간줄 표시
        } finally { // 예외가 발생해도 이 부분은 동작하고 끝!
            System.out.println("finally 블럭의 내용이 동작함.");
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
