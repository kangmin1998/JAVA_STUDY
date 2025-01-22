package chap04_control_flow.com.section03.branching;

public class A_break {

    public void simpleBreakStatement() {

        /*
            [ break; ]
            반복문을 빠져나올 목적으로 사용한다.
            반복문의 조건식 판단 결과와 상관없이 반복문을 빠져 나온다.
            일반적으로 if(조건식) {break;} 이런 식으로 사용된다.
            단, switch문은 반복문이 아니지만 예외적으로 사용된다.
         */

        int i = 1;
        int sum = 0;

        while(true) {
            sum += i;

            if(i == 100) {
                break;
            }
            i++;
        }
        System.out.println("1부터 100까지의 합 : " + sum);
    }

    public  void testJumpBreak() {

        label1 :
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("====== " + dan + " 단 입니다. ======");
            label2 :
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));

                if(su >= 5) {
                    break label1;
                }
            }
            System.out.println();
        }
        System.out.println("구구단 끝~!");
    }
}
