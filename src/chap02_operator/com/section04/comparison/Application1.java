package chap02_operator.com.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /*
            [ 비교 연산자 ]
            비교 연산자는 피연산자 사이에 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자 이다.
            삼항 연산자의 조건식이나 조건문의 조건절에 많이 사용된다.

            [ 비교 연산자의 종류 ]
            == : 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true, 다르면 false를 반환한다.
            != : 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면 true, 같으면 false를 반환한다.
            >  : 왼쪽의 피연산자가 오른쪽보다 크면 true, 그렇지 않으면 false를 반환합니다.
            >= : 왼쪽의 피연산자가 오른쪽보다 크거나 같으면 true, 그렇지 않으면 false를 반환합니다.
            <  : 왼쪽의 피연산자가 오른쪽보다 작으면 true, 그렇지 않으면 false를 반환합니다.
            <= : 왼쪽의 피연산자가 오른쪽보다 작거나 같으면 true, 그렇지 않으면 false를 반환합니다.

        */


        /* [ 숫자값 비교 ] */
        int inum1 = 1;
        int inum2 = 2025;
        System.out.println("숫자값 비교");
        System.out.println("inum1 == inum2 : " + (inum1 == inum2));
        System.out.println("inum1 != inum2 : " + (inum1 != inum2));
        System.out.println("inum1 > inum2 : " + (inum1 > inum2));
        System.out.println("inum1 >= inum2 : " + (inum1 >= inum2));
        System.out.println("inum1 <= inum2 : " + (inum1 <= inum2));
        System.out.println("inum1 < inum2 : " + (inum1 < inum2));


        /* [ 실수 비교] */
        double dnum1 = 12.0;
        double dnum2 = 20.25;
        System.out.println("실수 비교");
        System.out.println("dnum1 == dnum2 : " + (dnum1 == dnum2));
        System.out.println("dnum1 != dnum2 : " + (dnum1 != dnum2));
        System.out.println("dnum1 > dnum2 : " + (dnum1 > dnum2));
        System.out.println("dnum1 >= dnum2 : " + (dnum1 >= dnum2));
        System.out.println("dnum1 <= dnum2 : " + (dnum1 <= dnum2));
        System.out.println("dnum1 < dnum2 : " + (dnum1 < dnum2));

        /* [ 문자값 비교 ]*/
        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65
        System.out.println("문자값 비교");
        System.out.println("ch1 == ch2 : " + (ch1 == ch2));
        System.out.println("ch1 != ch2 : " + (ch1 != ch2));
        System.out.println("ch1 > ch2 : " + (ch1 > ch2));
        System.out.println("ch1 >= ch2 : " + (ch1 >= ch2));
        System.out.println("ch1 <= ch2 : " + (ch1 <= ch2));
        System.out.println("ch1 < ch2 : " + (ch1 < ch2));

        // 문자열, 논리값으 대소 비교가 불가능하다.
    }
}
