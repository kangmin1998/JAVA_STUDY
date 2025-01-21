package chap03_method_and_api.com.section02.package_and_import;

import javax.swing.*;

public class Application1 {
    public static void main(String[] args) {
        /*
            이 클래스의 풀클래스명 : chap03_method_and_api.com.section02.package_and_import.Application1
         */

        /* [non-static 메서드] */
            chap03_method_and_api.com.section01.method.Calculator calc =
            new chap03_method_and_api.com.section01.method.Calculator();
            int min = calc.minNumberOf(300, 100);

        System.out.println("더 작은 값 : " + min);

        /* [static 메서드] */
        int max = chap03_method_and_api.com.section01.method.Calculator.maxNumberOf(300, 100);

        System.out.println("더 큰 값 : " + max);
        System.out.println("더 큰 값 : " + chap03_method_and_api.com.section01.method.Calculator.maxNumberOf(200, 100));
    }
}

