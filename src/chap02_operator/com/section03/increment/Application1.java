package chap02_operator.com.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /*
         * [증감 연산자]
         * 피연산자의 앞 또는 뒤에 사용한다.
         *  ++ : 1 증가의 의미
         *  -- : 1 감소의 의미
         * */

        /* 1. 증감 연산자를 단항으로만 사용
         * 단항으로 사용할 때는 1 증가 / 1 감소의 의미를 가진다. */
        int num = 20;
        System.out.println("num : " + num);

        num++;
        System.out.println("num++ : " + num);

        ++num;
        System.out.println("++num : " + num);

        num--;
        System.out.println("num-- : " + num);

        --num;
        System.out.println("--num : " + num);

        /* 2. 증감 연산자를 다른 연산자와 함께 사용
         * ++var : 피연산자의 값을 먼저 1 증가시킨 후, 다른 연산을 진행
         * var++ : 다른 연산을 먼저 진행하고, 마지막에 피연산자의 값을 1 증가시킴
         * --var : 피연산자의 값을 먼저 1 감소시킨 후, 다른 연산을 진행
         * var-- : 다른 연산을 먼저 진행하고, 마지막에 피연산자의 값을 1 감소시킴
         * */

        int firstNum = 20;

        int result = firstNum++ * 3;

        /*
         * int result = firstNum * 3
         * firstNum += 1;
         * */

        System.out.println("result : " + result);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum * 3;

        /*
         * secondNum += 1;
         * int result2 = secondNum * 3
         * */

        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

    }
}
