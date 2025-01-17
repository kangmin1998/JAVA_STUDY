package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {

        /*
            강제형변환
            바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
            (바꿀 자료형) 값;

            강제형변환 규칙
            1. 큰 자료형에서 작은 자료형으로 변경 시
            2. 실수를 정수로 변경 시
            3. 문자형을 int미만 크기의 변수에 저장할 시
            4. 논리형은 강제 형변환 규칙에서도 제외
        */

        // 작은 바이트에서 큰 바이트로 바꿀땐 강제형변환 해야한다.
        long lnum = 8;
//      int inum = lnum;             // 데이터가 손실 가능성이 있기 때문에 에러
        int inum = (int)lnum;        // 변경하려는 자료형은 명시하여 강제 형변환을 해야 함.

        double dnum = 8.0;
//      float flnum = dnum;          // 데이터가 손실 가능성이 있기 때문에 에러
        float fnum = (float)dnum;    // 변경하려는 자료형은 명시하여 강제 형변환을 해야 함.

        float fnum2 = 4.0f;
//      long lnum2 = fnum2;          // float는 4byte, long은 8byte임에도 자동 형변환 불가(소수점 이하 데이터 솔실 가능성)
        long lnum2 = (long)fnum2;


        char ch = 'a';
        byte bnum2 = (byte)ch;

        // 논리형은 강제 형변환 규칙에서도 제외
        boolean isTrue = true;
//      byte b = (byte)isTrue;
//      int i = (int)isTrue;
//      char c = (char)isTrue;


    }
}
