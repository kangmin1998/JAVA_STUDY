package chap04_control_flow.com.section01.conditional;

import java.util.Scanner;

public class C_switch {
    /*
        [ switch문 표현식 ]
        switch(비교할변수) {
            case 비교값1 : 비교할변수의 값 == 비교값1 인 경우 실행할 구문;
            break;
            case 비교값2 : 비교할변수의 값 == 비교값2 인 경우 실행할 구문;
            break;
            default : 위 case에 모두 해당하지 않는 경우 실행할 구문;
            break;
        }
     */

    public void simpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int secondNum = sc.nextInt();
        System.out.print("연산 기호 입력 ( + - * / %) : ");
        char operator = sc.next().charAt(0);// 입력받은  "문자열"의 0번째 인덱스를 '문자형'으로 반환

        int result = 0;

        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            default:
                System.out.println("잘못된 연산자를 입력하셨습니다.");
                break;
        }
        System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);

        sc.close();

    }

    public void switchVendingMachine() {
        /*
            [ switch-case문 이용 실습 ]
            1. Scanner를 이용해 음료 이름(String)과 갯수(int)를 입력받는다.
            2. switch-case 문을 사용해 전체 가격을 구한다.
            3. [ '음료이름'을 '개수'개 선택하셨습니다. '가격'을 투입해주세요. ]
            위와 같이 출력되도록 한다.
         */

        System.out.println("==== pandas Vending Machine ====");
        System.out.println("==== 코카콜라 / 칠성사이다 / 피크닉 / 핫식스 ====");
        /* 코카콜라 1,700원  /  칠성사이다 1,500원  /  피크닉 1,000  /  핫식스 2,100원 */

        Scanner sc = new Scanner(System.in);
        int price = 0;

        // 음료 이름을 잘못 선택할 경우 반복하도록 while문 사용
        while (true) {
            System.out.print("선택하실 음료 이름을 적어주세요 : ");
            String name = sc.nextLine();

            // 올바른 음료 이름인지 확인
            if (name.equals("코카콜라") || name.equals("칠성사이다") || name.equals("피크닉") || name.equals("핫식스")) {
                // 음료 이름이 맞으면 개수 입력 받기
                System.out.print("갯수를 적어주세요 : ");
                int num = sc.nextInt();
                sc.nextLine(); // 엔터 키 처리

                // switch-case문을 통해 가격 계산
                switch (name) {
                    case "코카콜라":
                        price = num * 1700;
                        break;
                    case "칠성사이다":
                        price = num * 1500;
                        break;
                    case "피크닉":
                        price = num * 1000;
                        break;
                    case "핫식스":
                        price = num * 2100;
                        break;
                    default:
                        break;  // 기본값은 실행되지 않음
                }

                // 결과 출력
                System.out.println(name + "을 " + num + "개 선택하셨습니다. " + price + "원을 투입해주세요.");
                break;  // 올바른 음료를 선택했으므로 while문 종료
            } else {
                // 잘못된 음료를 선택했을 경우 다시 입력 받도록 안내
                System.out.println("음료선택이 잘못되었습니다. 음료선택을 다시 하세요.");
            }
        }

        sc.close();
    }
}