package chap04_control_flow.com.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    public void simpleDoWhileStatement() {
        /*
            [ do-while문 표현식 ]
            초기식;
            do {
                1회차에는 무조건 실행되고 이후에는 조건식을 확인하여 수행할 구문(= 반복할 구문);
                증감식;
            } while(조건식);
         */

        do {
            System.out.println("동작");
        }while(false);
        System.out.println("끝~!");
    }

    public void testDoWhileSample() {
        /*
            [ 입력받은 문자열 출력하기 ]
            1. Scanner를 이용하여 문자열을 입력 받는다.
            2. 입력받은 문자열을 출력해준다.
            3. 만약 "exit"가 입력되면 프로그램을 종료한다.
            (참고) 문자열은 == 비교가 불가능하므로 equals()를 사용한다. (자세한 내용은 뒤에서 다룰 예정)
            ex)  입력받은 문자열 변수.equals("비교할 문자열") -> 같으면 true, 다르면 false
         */
        Scanner sc = new Scanner(System.in);
//        System.out.print("입력 받은 문자열 : ");
//        String str = sc.nextLine();
//        System.out.println(str);

            String str1;
        do {
            System.out.print("문자열을 입력하세요 : ");
            str1 = sc.nextLine();
            System.out.println("입력받은 문자열 : " + str1);
        } while(!str1.equals("exit"));

        sc.close();
    }
}
