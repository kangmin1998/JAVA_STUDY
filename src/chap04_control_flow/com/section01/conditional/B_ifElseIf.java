package chap04_control_flow.com.section01.conditional;

import java.util.Scanner;

public class B_ifElseIf {
    /*
        [if-elseIf 표현식]
        if(조건식1) {
            조건식1이 true일 때 실행할 명령문;
        } else if(조건식2) {
            조건식1은 false이고, 조건식2는 true일 때 실행할 명령문;
        } else{
            조건식1, 조건식2 모두 false일 경우 실행할 명령문;
        }
     */

    public void simpleIfElseIfStatment(){
        System.out.println("펑~ 산신령이 나타났다.!");
        System.out.println("어느 도끼가 네 도끼니? (1. 금도끼 / 2. 은도끼 / 3. 쇠도끼)");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        

        if(answer == 1) {
            System.out.println("거짓말치지 말거라! 욕심이 과하구나!!");
        } else if(answer == 2) {
            System.out.println("욕심을 크게 부리지는 않으나 거짓말을 하는구나, 네 이놈!!");
        }else if(answer == 3) {
            System.out.println("너는 정말 정직한 나무꾼이로구나, 옛다 다 다지렴~!");
        }
        else {
            System.out.println("잘못 입력했습니다.!");
        }
        System.out.printf("산신령은 연못으로 다시 사라진다.. 펑~");

        sc.close();
    }

    public void nestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("학생의 이름 : ");
        String name = sc.nextLine();
        System.out.printf("학생의 점수 : ");
        int score = sc.nextInt();

        String grade = "";

        if(score >= 90) {
            grade = "A";

            if(score >= 95) {
                grade += "+";
            }
        } else if(score >= 80) {
            grade = "B";
            if(score >= 85) {
                grade += "+";
            }
        } else if(score >= 70) {
            grade = "C";
            if(score >= 75) {
                grade += "+";
            }
        } else if(score >= 60) {
            grade = "C";
            if (score >= 65) {
                grade += "+";
            }
        }
        else {
            grade = "F";
        }
        System.out.println(name + "학생의 점수는 " + score + " 이고, 등급은 " + grade + " 입니다.");

        sc.close();
    }
}
