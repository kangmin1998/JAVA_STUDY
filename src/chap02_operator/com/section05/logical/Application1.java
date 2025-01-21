package chap02_operator.com.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        /*
        [ 논리 연산자 ]
        논리값(true/false)를 취급하는 연산자이다.

        [ 논리 연산자의 종류 ]
        1. 논리 연결 연산자 : 두개의 피 연산자를 가지는 이항 연산자이며, 결함 방향은 왼쪽에서 오른쪽이다.
          1-1. &&(논리 AND) 연산자 : 두 개의 논리식 모두 참일 경우 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
          1-2. ||(논리 OR) 연산자 : 두개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환, 모두 거싯일 경우 거짓 반환
          2. 논리 부정 연산자 : 피연산자가 하나인 단항 연산자로, 결합 방향은 왼쪽에서 오른쪽이다.
             !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환
        */
        System.out.println("&& 논리 연산자");
        System.out.println("true && true : " + (true && true));
        System.out.println("false && false : " + (false && false));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));

        System.out.println("|| 논리 연산자");
        System.out.println("true || true : " + (true || true));
        System.out.println("false || false : " + (false || false));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("! 논리 부정 연산자");
        System.out.println("true -> not : " + (!true));
        System.out.println("false -> not : " + (!false));

        // 논리식에 논리 연산자 활용
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지? " + (a < b && c < d));
        System.out.println("a가 b보다 크거나 같으면서 c가 d보다 크거나 같은지? " + (a >= b && c >= d));

        System.out.println("a가 b보다 크거나 c가 d보다 크거나 작은지? " + (a > b || c < d));

    }
}
