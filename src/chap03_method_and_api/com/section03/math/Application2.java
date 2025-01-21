package chap03_method_and_api.com.section03.math;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {

        /*
            [ java.util.Random ]
            nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생기켜 정수 형태로 변환

            [원하는 범위의 난수를 구하는 공식]
//            random.next(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         */
        // 객체를 생성해야함... 난 이걸 선호 해야지...
        Random random = new Random();
        /* [ 1 ~ 10 까지의 난수 출력 ] */
        int random1 = random.nextInt(10) + 1;
        System.out.println("1 ~ 10 사이의 난수 발생 : " + random1);
    }
}
