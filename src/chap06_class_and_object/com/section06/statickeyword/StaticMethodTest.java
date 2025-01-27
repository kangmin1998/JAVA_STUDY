package chap06_class_and_object.com.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticmethod() {
        this. count++;
        System.out.println("nonStaticMethod 호출 됨");
    }

    public static  void staticMethod() {
        // static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this에 담길 수 없다.
//        this.count++;
        System.out.println("StaticMethod 호출 됨");
    }
}
