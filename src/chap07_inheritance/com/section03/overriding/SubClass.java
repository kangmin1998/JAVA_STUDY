package chap07_inheritance.com.section03.overriding;

public class SubClass extends SuperClass{

    // 메소드 이름, 리턴 타입, 매개변수의 갯수&타입&순서 모두 일치해야 한다.
    @Override
    //public void method1(int num) {}       // 변수 이름 일치해야 한다.
    //public int method(int num) { return;} // 타입 일치해야한다.
    //public void method(String num) {}     // 타입 일치해야한다.
    public void method(int num) {

    }

    /* [ private 메소드 오버라이딩 불가 ] */
//    @Override
//    private void privateMethod() {
//    }

    /* [ final 메소드 오버라이딩 불가 ] */
//    @Override
//    public final void finalMethod() {
//    }


    // prtected -> default 로 변경시 더 좁은 범위로 변경이라 불가.
//    @Override
//    default void protectedMethod() {
//    }

    // protected -> public 은 더 넓은 범위로 변경이라 가능.
    @Override
    public void protectedMethod() {
    }
}
