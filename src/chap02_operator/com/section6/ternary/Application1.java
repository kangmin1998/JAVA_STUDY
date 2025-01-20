package chap02_operator.com.section6.ternary;

public class Application1 {
    public static void main(String[] args) {
        /*
            [ 삼항 연산자 ]
            자바에서 유일하게 피연산자가 3개인 연산자이다.
            (조건식)? 참일 때 사용할 값 : 거짓일 때 사용할 값
        */

        int num1 = 100;
        int num2 = -100;
        String result1 = (num1 > 0) ? "Yes" : "No";
        String result2 = (num2 > 0) ? "Yes" : "No";
        System.out.println("num1 : " + result1);
        System.out.println("num2 : " + result2);

        /* 삼항연산자 중첩 사용 */
        int num3 = 7;
        int num4 = 0;
        int num5 = -7;
        String result3 = (num3 > 0)?"양수다!" : (num3 == 0)?"0이다!": "음수다!";
        String result4 = (num4 > 0)?"양수다!" : (num4 == 0)?"0이다!": "음수다!";
        String result5 = (num5 > 0)?"양수다!" : (num5 == 0)?"0이다!": "음수다!";

        System.out.println("num3 : " + result3);
        System.out.println("num4 : " + result4);
        System.out.println("num5 : " + result5);
    }
}
