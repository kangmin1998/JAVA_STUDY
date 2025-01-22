package chap04_control_flow.com.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C_while {

    public void simpleWhileStatement() {

        /*
            [ while문 표현식 ]
            초기식;
            while(조건식){
            조건을 만족할 때 수행할 구문(= 반복할 구문);
            증감식;
            }
         */

        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileSample1() {

        /*
            [ 1부터 10까지 더해서 출력하기 ]
            while문을 사용해 1부터 10까지 더해서 출력한다.
         */

        int  i = 0;
        int sum = 0;
        while(i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public void testWhileSample2() {

        /*
            [ 구구단 ]
            중첩된 while문을 활용하여 구구단을 출력한다.
         */
        int i = 2;
        int j = 1;

        while(i <= 9) {
            System.out.println("========" + i + " 단========");
            j = 1;
            while (j <= 9) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println("구구단 끝~~!");
    }

    public void testWhileSample3() {

        /*
            [ 문자열을 문자형으로 쪼개어 출력하기 ]
            1. Scanner를 이용하여 문자열을 입력 받는다.
            2. 입력한 문자열의 인덱스를 활용하여 한 글자씩 문자형으로 출력한다.
            (참고) 문자열에서 인덱스에 해당하는 문자형을 반환하는 기능 charAt(인덱스)를 사용하고,
                  문자열의 길이를 정수형으로 반환하는 기능 length()를 사용하면 된다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        int i = 0;
        char ch1 = str.charAt(0);
        while (i <= str.length() - 1) {
            ch1 = str.charAt(i);
            System.out.println("입력받은 문자열의 문자형은 : " + ch1);
            i++;
        }



    }
}
