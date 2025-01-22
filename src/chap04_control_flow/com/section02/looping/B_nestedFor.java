package chap04_control_flow.com.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    /*

     */

    public void printGugudan() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("====== " + dan + " 단 입니다. ======");
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void printStarInputRow(){
        /*
            [ 별 5개 찍기 ]
            1. scanner를 이용하여 row수 (int)를 입력 받는다.
            2. 한 줄에 *이 5개인 row를 입력받은 만큼 출력된다.
                (단, 중첩 for문을 사용한다.)
         */


        Scanner sc = new Scanner(System.in);
        System.out.print("별을 몇줄 입력할래? : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }


    public void star() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printStarTraining() {
        /*
            [갯수만큼 * 찍기]
            1. Scanner를 이용하여 row수(int)를 입력 받는다.
            2. 줄마다 row 수 만큼 *을 출력한다.
            예시) 정수를 입력하세요. 5
            *
            **
            ***
            ****
            *****
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




        sc.close();
    }



//    public void aaa() {
//        int total = 0;
//        for (int i = 2; i <= 9; i++) {
//            System.out.println(i + " 단 입니다.");
//            for(int j = 1; j <= 9; j++) {
//                total = i * j;
//
//                System.out.println(i + " * " + j + " = " + total);
//            }
//        }
//    }
}
