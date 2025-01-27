package chap06_class_and_object.com.section05.overloading;

public class OverloadingTest {
//    public static void main(String[] args) {
//        System.out.println(); // println은 함수 안에 매게변수로 받을 수 있는 오버로딩?
//    }

    /* [ 오버로딩 ] */
    /*
        사용 이유
        매개변수의 종류 별로 베소드 내용을 다르게 작성해야 하는 경우들이 종종 있는데
        동일 기능이 메소드를 매개변수에 따라 다른 이름을 붙이면 관리가 어렵기 때문에 사용한다.
        EX) System.out.println() -> println()안에 자료형이 들어가있고, 함수도 있다? int,long,float,double,String,char...등등
     */

    /* [ 오버로딩 조건 ] */
    /*  메소드 시그니처가 같으면 compile error를 발생 시킨다.
        1. 메소드 시그니처란?
          - 메소드명과 파라미터 선언부를 의미하며 접근제한자, 반환형은 오버로딩 성립 요건에 해당하지 않는다
     */
    public void test() {

    }
    // 동일한 조건의 매게 변수는 안됨.
//    public void test() {
//    }
    // 접근 제한도 안된다.
//    private  void test() {
//    }
    // 반환형도 오버로딩이 성립 하지 않는다.
//    public  int test() {
//        return 0;
//    }

    public void test(int num) { // test(1);
    }

    //매개 변수 이름은 오버로딩과 무관하다.
//    public  void test(int num2) {
//    }


    public void test(int num1, int num2) { // test(1, 2);
    }
    public void test(int num, String name) { // test(1, "hi");
    }
    public void  test(String name, int num) { // test("hi", 1);
    }

//    같은 test여도 불러와 쓰는 메서드는 다 다르다.
//    test(1);
//    test(1, 2);
//    test(1, "hi");
//    test("hi", 1);


}
