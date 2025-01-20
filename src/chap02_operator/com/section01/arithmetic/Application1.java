package chap02_operator.com.section01.arithmetic;

public class Application1 {
    public static void main(String[] args) {
        /*
            산술 연산자
            산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이며 많이 사용된다.
            연산의 실행을 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
            피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.

            산술 연산자의 종류
            + : 왼쪽의 피연산자에 오른쪽의 피연산자를 더함
            - : 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌
            * : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱합
            / : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눔
            % : 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 나머지를 구함

            산술연산자의 우선순위
            곱하기(*), 나누기(/), mod(%)가 더하기(+), 빼기(-)보다 우선 동작한다.
            우선순위가 같은 경우 연산자의 결합 방향에 의해 실행 순서가 결정된다.
        */

        int num1 = 1;
        int num2 = 20;

        System.out.println("num1 + num2 : " + (num1 + num2));
        System.out.println("num1 - num2 : " + (num1 - num2));
        System.out.println("num1 * num2 : " + (num1 * num2));
        System.out.println("num1 / num2 : " + (num2 / num1));
        System.out.println("num1 % num2 : " + (num1 % num2));

    }
}