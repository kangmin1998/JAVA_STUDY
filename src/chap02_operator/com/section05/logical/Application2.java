package chap02_operator.com.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /*
            [ 논리 연산자의 우선순위 ]
            && : 11위
            || : 12위
        */

        /*
            [ 코드 입력 방식 ]
            1 <= X <= 100 (X)
            X >= 1 && X <= 100(0)
        */

        int num1 = 77;
        System.out.println("1부터 100사이의 수? \n" + (1 <= num1 && num1 <= 100));


        /*
            [ 영어 대문자인지 확인 ]
        */
        char ch1 = 'J';
        char ch2 = 'j';
        System.out.println("ch1이 영어 대문자가 맞니? \n" + (ch1 >= 'A' && ch1 <= 'Z'));
        System.out.println("ch2이 영어 대문자가 맞니? \n" + (ch2 >= 'A' && ch2 <= 'Z'));

        /*
            [ 대소문자 상관 없이 영문자 y인지 확인 ]
        */
        char ch3 = 'Y';
        char ch4 = 'y';
        System.out.println("ch3은 영문자가 맞니? \n" + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("ch4은 영문자가 맞니? \n" + (ch4 == 'y' || ch4 == 'Y'));

        /*
            [ 영문자 확인 ]
        */
        char ch5 = 'q';
        char ch6 = 'Q';
        char ch7 = '&';
        System.out.println("ch5는 영문자가 맞니? \n" + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("ch6는 영문자가 맞니? \n" + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
        System.out.println("ch7는 영문자가 맞니? \n" + ((ch7 >= 'A' && ch7 <= 'Z') || (ch7 >= 'a' && ch7 <= 'z')));

        System.out.println(ch5 >= 'A' && ch5 <= 'z');
        System.out.println(ch6 >= 'A' && ch6 <= 'z');
        System.out.println(ch7 >= 'A' && ch7 <= 'z');
    }
}
