package chap03_method_and_api.com.section02.package_and_import;
import chap03_method_and_api.com.section01.method.Calculator;
// static import의 경우 사용하려는 까지 static method기술해야한다.
import static chap03_method_and_api.com.section01.method.Calculator.maxNumberOf;

public class Application2 {
    public static void main(String[] args) {

        /* [ non-static 메서드 ] */
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(1, 21);
        System.out.println("작은 값 : " + min);

        /* [ static 메서드 ] (클래스명 생략 가능)*/
        int max = maxNumberOf(1, 21);
        System.out.printf("큰 값 : " + max);

    }
}
