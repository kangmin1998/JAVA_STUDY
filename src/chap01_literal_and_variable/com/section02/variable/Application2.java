package chap01_literal_and_variable.com.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /*
             변수 선언 방법
             자료형 변수명;


             자료형이란?
             다양한 값의 형태로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드 이다.
             이러한 자료형은 기본자료형(Primary Type)과 참조자료형(Reference Type)으로 나누어진다.
        */

        // 정수를 취급하는 자료형
        byte bnum;      // 1byte
        short snum;     // 2byte
        int inum;       // 4byte
        long lnum;      // 8byte

        // 실수를 취급하는 자료형
        float fnum;     // 4byte
        double dnum;    // 8byte

        // 문자를 취급하는 자료형
        char ch;        // 2byte
        char ch2;        // 2byte

        // 논리값을 취급하는 자료형
        boolean isTrue; // 1byte

        // 이상 8가지 기본 자료형 이다.

        // 문자열을 취급하는 자료형
        String str;

        // 변수에 값 대입(값 대입 및 초기화)
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;      // long 자료형에 값을 초기화시킬때는 대문자 L을 붙여야 한다.

        fnum = 4.0f;    // 실수 뒤에 'f'를 붙여야 한다.
        dnum = 8.0;

        ch = 'a';
        ch2 = 97;       // 'a'는 97이라는 숫자와 대응 -> 숫자로도 저장 가능하다.

        isTrue = true;
        isTrue = false;

        str = "안녕하세요";

        /*
            숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double 이다.
            일반적으로 사용되는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하며
            정수형은 int, 실수형은 double이 대표 자료형이다.
        */
        // 선언과 동시에 초기화
        int point = 1000;
        int bonus = 100;
        System.out.println("bum의 값 : " + bnum);
        System.out.println("isTrue의 값 : " + isTrue);
        System.out.println("str의 값 : " + str);

        System.out.println("포인터와 보너스의 합은 : " + (point + bonus));

        point += 100; // point = point + 100;

        System.out.println("point = point + 100 : " + point);
    }
}
