package chap02_operator.com.section02.assignment;

public class Application1 {
    public static void main(String[] args) {
        /*
         * [대입 연산자와 산술 복합 대입 연산자]
         *  = : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
         *  += : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
         *  -+ : 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
         *  *= : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
         *  /= : 왼쪽의 피연산자에서 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
         *  %= : 왼쪽의 피연산자에서 오른쪽의 피연산자를 나눈 결과의 나머지를 왼쪽의 피연산자에 대입함
         * */

        int num = 12;
        System.out.println("num : " + num);

        num = num + 3;
        System.out.println("num + 3 : " + num);

        num += 3;
        System.out.println("num += 3 : " + num);

        num -= 3;
        System.out.println("num -= 3 : " + num);

        num *= 5;
        System.out.println("num * 5 : " + num);

        num /= 5;
        System.out.println("num / 5 : " + num);

        num %= 7;
        System.out.println("num %7 : " + num);

        /* 주의! 산술 복합 대입연산자의 작성 순서에 주의해야 한다.
         * 아래 상황은 산술 대입 연산자가 아니라, -5라는 음수를 num에 대입한 것이다. */
        num =- 5;
        System.out.println("num =-5 : " + num);

    }
}
