package chap06_class_and_object.com.section05.parameter;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */

        /* 매개 변수로 사용 가능한 자료형
           1. 기본 자료형
           2. 기본 자료형 배열
           3. 클래스 자료형
           4. 클래스 자료형 배열
           5. 가변 인자
         */

        ParameterTest pt = new ParameterTest();

        // 1. 기본 자료형을 매개변수로 전달(기본 자료형 8가지 모두 가능)
        // 기본 자료형 int, long, float, double 등등 같으 자료형은
        // 얕은 복사를 하므로 주소 값만 받는다.
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        // 기본 자료형은 "값을 전달" 하므로 메소드 내에서 변경 시켜도 main에서의 변수는 변화가 없다.
        System.out.println("main num : " + num);

        // 2. 기본 자료형 배열
        // new 객체를 만들어 heap에 얕은 복사를 통해 주소 값을 가지고 있기 때문에 값을 변경하면 stack에서도 값이 변경된다.
        // 깊은 복사 값을 복사 받는다.
        int[] iarr = new int[]{1, 2, 3, 4, 5};
        pt.testPrimaryTypeArrayParameter(iarr);

        // 배열은 "주소 값을 전달" 하므로 얕은 복사가 일어나 동일안 배열을 다루고 있다.
        // 따라서 값의 변화가 그대로 출력 된다.
        System.out.println("가동  iarr : " + Arrays.toString(iarr));

        // 3. 클래스 자료형
        Rectangle r = new Rectangle(12.5, 22.5);
        pt.testClassTypeParameter(r);

        // 클래스 자료형은 "주소 값을 전달" 하므로 얕은 복사가 일어나 동일한 객체를 다루고 있다.
        System.out.println("main의 넓이와 둘레 : ");
        r.calcArea();
        r.calcRound();

        // 5. 가변 인자
        // 인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변 인자를 활용할 수 있다.
        // pt.testVariableLengthArrayParameter(); name은 반드시 전달 되어야 함
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("홍길동", "볼링");
        pt.testVariableLengthArrayParameter("홍길동", "볼링", "축구", "테니스");
        pt.testVariableLengthArrayParameter("홍길동", new String[]{"볼링", "축구", "테니스"});
    }

}
