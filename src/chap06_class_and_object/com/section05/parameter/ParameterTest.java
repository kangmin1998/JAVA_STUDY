package chap06_class_and_object.com.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    // 1. 기본 자료형 (int)
    public void testPrimaryTypeParameter(int num) {
        System.out.println("매개변수로 전달 받은 값 : " + num);
        num += 10;
        System.out.println("가공 된 num : " + num);
    }

    // 2. 자료형(배열)
    public void testPrimaryTypeArrayParameter(int[] iarr) {
        System.out.println("매개변수로 전달 받은 값 : " + Arrays.toString(iarr));
        iarr[0] = 99;

        System.out.println("가공 된 num : " + Arrays.toString(iarr));
    }

    // 3. 클래스 자료형
    public void testClassTypeParameter(Rectangle r) {
        System.out.println("매개변수로 전달 받은 넓이와 둘레");
        r.calcArea();
        r.calcRound();

        r.setHeight(100);
        r.setWidth(100);

        System.out.println("가공 후 넓이와 둘레");
        r.calcArea();
        r.calcRound();
    }
    /* 매개 변수가 몇 개 전달 될 지 알 수 없으므로 반드시 매개변수 목록의 가장 뒤에 작성해야 한다. */
    // 가변인자 " ... " 는 배열로 사용 , 가변인자는 가장 마지막에 작성을 해야한다.
    public void testVariableLengthArrayParameter(String name, String... hobby) {
        System.out.println("이름 : " + name);
        System.out.println("취미 : " + Arrays.toString(hobby));
        System.out.println("취미의 개수 : " + hobby.length);
    }

//    가변 인자를 사용한 메소드를 오버로딩하면 모호해지는 문제가 발행할 수 있으므로 가급적 오버로딩을 하지 않는다.
//    가변인자는 호출할 때 어떤걸 호출 해야할지 애매하므로 가변인자는 오버로딩을 하지 않는게 좋다.
//    public void testVariableLengthArrayParameter(String... hobby) {
//    }

}
