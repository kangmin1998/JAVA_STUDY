package chap06_class_and_object.com.section07.kindsofvariable;

public class KindsOfVariable {

    /*
        클래스 영역에 작성하는 변수를 필드라고 한다.
        필드 == 멤버변수 == 전역변수
     */

    // non-static field를 인서턴스 변수라고 한다.(인스턴스 생성 시점에 사용 가능한 변수)
    private int globalNum;

    // static field를 클래스 변수라고 한다.(정적 메모리 영역에 생성 되는 변수)
    private static int staticNum;

    public void method(int num) { // 매개변수(일종의 지역 변수)
        int localNum; // 지역 변수
        // 매개 변수는 호출 시 값이 전달 되므로 별도의 초기화는 필요 없다.
        System.out.println("num : " + num);

        // 지역 변수 선언 외에 다시 사용하기 위해서는 반드시 초기화가 되어야 한다.
        // System.out.println("localNum : " + localNum);

        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }

    public void method2() {
        // 지역 변수는 해당 지역(블럭 내)에서만 사용이 가능하며
        // 전역 변수는 클래스 내의 모든 영역에서 사용할 수 있다.
        // System.out.println("localNum : " + localNum);
        System.out.println("globalNum : " + globalNum);
        System.out.println("staticNum : " + staticNum);
    }
}

