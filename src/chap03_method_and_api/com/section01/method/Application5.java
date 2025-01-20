package chap03_method_and_api.com.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Application5 {

    public int plusTwoNumber(final int a, final int b) {
        return a + b;
    }

    public int minusTwoNumber(final int a, final int b) {
        return a - b;
    }

    public String multipleTwoNumber(final int a, final int b) {
        return "두 수를 곱하기 : " + a * b;
    }

    public void divideTwoNumber(final int a, final int b) {
        System.out.println("두 수를 나눈 몫 : " + a / b);
    }

    public static void main(String[] args) {
        /*
            [ 간단한 계산기 만들기 ]
            매개변수와 리턴값을 복합적으로 이용하여
            매개변수와 리턴값이 모두 존재하는 메소드를 만들어 보자.
         */

        int firstNum = 20;
        int secondNum = 10;

        Application5 app5 = new Application5();
         System.out.println("두 수를 더하기 : " + app5.plusTwoNumber(firstNum, secondNum));
         System.out.println("두 수를 빼기 : " + app5.minusTwoNumber(firstNum, secondNum));
         System.out.println(app5.multipleTwoNumber(firstNum, secondNum));
        app5.divideTwoNumber(firstNum, secondNum);

        /*
            출력예시
            두 수를 더하기 : 30
            두 수를 빼기 : 10
            두 수를 곱하기 : 200
            두 수를 나눈 몫 : 2
         */
    }
}
