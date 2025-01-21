package practice;

import java.util.Scanner;

public class practice_02 {
    //    public void allBonus() {
//        if (allmoney)
//    }
    public static void main(String[] args) {
        /* 영업사원의 월급을 계산하는 프로그램을 작성하려고 합니다.

         * 월 급여액과 월 매출액을 입력 받아 급여를 산정합니다.

         * 영업사원은 매출액 대비 보너스율에 명시된 보너스를 급여 외에 추가로 지급받습니다.
         *
         * 단, 보너스율은 입력 받은 월 매출액에 비례하며,

         * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산한다.
         *
         * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어보세요
         *





         * -- 총 급여 계산식 --
         * 총 급여 = 월 급여  + (매출액 * 보너스율)
         *




         * -- 매출액 대비 보너스율 --
         *   매출액       보너스율
         * 5천만원 이상      5%
         * 3천만원 이상      3%
         * 1천만원 이상      1%
         * 1천만원 미만      0%
         *





         * -- 입력 예시 --
         * 월 급여 입력 : 3,000,000
         * 매출액 입력 : 20,000,000
         *
         * -- 출력 예시 --
         * ======================
         * 매출액 : 20,000,000
         * 보너스율 : 1%
         * 월 급여 : 3,000,000
         * 보너스 금액 : 200,000
         * ======================
         * 총 급여 : 3,200,000
         * */

        Scanner in = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int money = in.nextInt();       // 월급여
        System.out.print("매출액 입력 : ");
        int allMoney = in.nextInt();    // 매출액

        int allBonus = 0;               // 보너스율
        int realAllMoney = 0;           // 총급여
        int bonusMoney = 0;             // 보너스 금액
        realAllMoney = money + (allMoney * allBonus);

        if (allMoney >= 50000000) {
            allBonus = 5;
        } else if (allMoney >= 30000000) {
            allBonus = 3;
        } else if (allMoney >= 10000000) {
            allBonus = 1;
        }

        bonusMoney = allMoney / (allBonus * 100); //보너스 금액 계산
        realAllMoney = realAllMoney + bonusMoney; // 총 급여 계산
            in.close();
        System.out.println("===============");
        System.out.println("매출액 : " + allMoney);
        System.out.println("보너스율 : " + allBonus + "%");
        System.out.println("월 급여 : " + money);
        System.out.println("보너스 금액 : " + bonusMoney);
        System.out.println("===============");
        System.out.println("총 급여 : " + realAllMoney);
    }
}
