package chap06_class_and_object.com.section06.finalkeyword;

public class FinalFieldTest {
    /* [final 키워드] */
    /*
        final 키워드를 사용할 수 있는 위치는 다양하다.
        1. 지역 변수 : 초기화 이후 값 변경 불가
        2. 매개 변수 : 호출 시 전달한 인자 변경 불가
        3. 인스턴스 변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
        4. 클래스 변수(static) : 프로그램 시작 이후 값 변경 불가
        5. non - static 메소드 : 메소드 재작성(overriding) 불가
        6. static 메소드 : 메소드 재작성(overriding) 불가
        7. 클래스 : 상속 불가
     */

    /* [non - static 필드에 final 사용] */
    // 초기 인스턴스 생성 시 기본 값 0이 필드에 들어가게 되는데 초기화 이후 값 변경이 불가능하므로
    // 선언과 동시에 초기화를 해주어야 한다. 그렇지 않으면 compile error가 발생한다.
    // private final int nonStaticNum; // final를 사용하면 초기화를 해야한다.

    /* [ 선언과 동시에 초기화 ] */
    private final int NON_STATIC_NUM = 1;

    /* [ 생성자를 이용해서 초기화 ] */
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName){
        this.NON_STATIC_NAME = nonStaticName;
    }

    /* [ static field에 final 키워드 사용 ] */
    // private static final int STATIC_NUM;
    private static final int STATIC_NUM = 1;

    /* [ static field에 final 생성자를 이용해서 초기화 불가능 ] */
    // 생성자는 인스턴스 생성 시점에 호출되고, static은 프로그램이 시작 될 때 할당 되므로
    // 초기화 되지 않은 상태로 선언 된 것과 동일하다.
    private  static final double STATIC_DOUBLE;
//
//    public FinalFieldTest(double staticDouble) {
//        FinalFieldTest.STATIC_DOUBLE = staticDouble;
//    }

    /* [ static 초기화 블럭 ] */
    static  {
        STATIC_DOUBLE = 0.5;
    }

    /* ["public static final"을 상수 필드라고 칭한다.] */
     // double radius = MathMath.PI;











}
