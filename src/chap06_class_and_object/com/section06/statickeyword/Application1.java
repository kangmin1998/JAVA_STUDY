package chap06_class_and_object.com.section06.statickeyword;

public class Application1 {
    public static void main(String[] args) {
        /* [ static ] */

        StaticFieldTest stf1 = new StaticFieldTest();

        System.out.println("non-static field : " + stf1.getNonStaticCount());
        System.out.println("static field : " + stf1.getStaticCount());

        stf1.increaseNonStaticCount();
        stf1.increaseStaticCount();

        System.out.println("non-static field : " + stf1.getNonStaticCount());
        System.out.println("static field : " + stf1.getStaticCount());

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("non-static field : " + sft2.getNonStaticCount());
        System.out.println("static field : " + sft2.getStaticCount());

        /* 인스턴스 변수의 경우  stf1와 stf2 두 개의 인스턴스가 생성 될 때마다 새로운 공간이 heap 영역에 할당 되어
           0으로 초기화 된다. static 변수의 경우  sft1과 sft2가 모두 static 영역에 할당 된 하나의 공간을 공유하므로
           증가된 1이 된다.
        */

        /* [ static 메소드 호출] */
        StaticMethodTest.staticMethod();

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticmethod();
    }
}
