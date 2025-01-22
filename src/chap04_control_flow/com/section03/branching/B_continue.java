package chap04_control_flow.com.section03.branching;

public class B_continue {

    /*
        [ continue ]
        continue는 반복문 내에서 사용한다.
        반복문의 해당 회차를 넘기고, 증감식으로 이동하게 한다.
        일반적으로 if(조건식) { continue } 이런 식으로 사용한다.
        보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용한다.
     */
    public void simpleContinueStatement() {

        for (int i = 1; i <= 100; i++) {
            if(i % 4 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public void testJumpContinue() {
        label1 :
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("====== " + dan + " 단 입니다. ======");
            label2 :
            for (int su = 1; su < 10; su++) {

                if (su % 2 == 0) {
                    continue label1;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
}
