package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {

        // 문자열 합치기
        System.out.println("두 개의 문자열 합치기");
        System.out.println(9 + 9);
        System.out.println("9" + 9);    // 문자열 :9 숫자 : 9
        System.out.println("9" + "9");

        System.out.println("세 개의 문자열 합치기");
        System.out.println(9 + 9 + "9");     // 189
        System.out.println(9 + "9" + 9);     // 999
        System.out.println("9" + 9 + 9);     // 999
        System.out.println("9" + (9 + 9));   // 918

        // 문자열 합치기를 응요하여 출력 결과를 보기 좋게 변경
        System.out.println("10과 20의 합 : " + (10 + 20));





    }
}
