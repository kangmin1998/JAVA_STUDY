package practice;

import java.util.Scanner;

public class practice_05 {
    public static void main(String[] args) {
        /*
            [ 점수의 합계와 평균 구하기 ]
            1. 길이가 5인 정수형 배열을 만든다.
            2. Scanner를 이용하여 학생 5명의 java 시험 점수를 입력받아, 만든 배열에 저장한다.
            3. 배열의 저장한 점수의 합계(int)와 평균(bouble)을 구하여 출력한다.
         */
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int score = 0;
        int total = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 학생의 점수를 입력하세요.");
            score = sc.nextInt();
            arr[i] = score;
            total += score;
        }
        avg = total / arr.length;

        System.out.println("배열에 저장한 점수의 합계는 : " + total + " 평균은 : " + avg + "입니다.");

        sc.close();

    }
}
