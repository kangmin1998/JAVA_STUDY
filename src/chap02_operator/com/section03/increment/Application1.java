package chap02_operator.com.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /*
            증감 연산자
            피연산자의 앞 또는 뒤에 사용한다.
            ++ : 1 증가의 의미
            -- : 1 감소의 의미
        */


        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println(result2);
    }
}
