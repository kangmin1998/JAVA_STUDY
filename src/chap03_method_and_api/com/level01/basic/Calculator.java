package chap03_method_and_api.com.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(int a, int b){
        int total = 0;
        for(int i = a; i <= b; i++){
            total += i;
        }
        return total;
    }

    public void checkMaxNumber(int a, int b){
        int maxNumber = (a > b) ? a : b;
        System.out.println("두 수 중 큰 수는 : " + maxNumber + "이다." );
    }

    public int sumTwoNumber(int a, int b){
        return a + b;
    }

    public int minusTwoNumber(int a, int b){
        return a - b;
    }

}
