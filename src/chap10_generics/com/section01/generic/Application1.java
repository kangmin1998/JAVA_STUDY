package chap10_generics.com.section01.generic;

public class Application1 {
    public static void main(String[] args) {
        /* [ 제네릭 ] */
        /*
            제네릭의 사전적인 의미는 일반적인 의미이다.
            자바에서 제네릭은 데이터 타입을 일반화 한다는 의미를 가진다.
         */

        // 제네릭 클래스로 인스턴스를 생성할 시 타입 변수 자리에 사용하려는 타입을 명시 한다.
        // 타입을  Integer로 인스턴스를 생성
        GenericTest<Integer> gt = new GenericTest<>();
        // GenericTest<Integer> gt = new GenericTest<Integer>();  위와 같은 코드 객체 생성시 뒤에 다이아몬드는 Integer 생략 가능.
        gt.setValue(10);
        System.out.println(gt.getValue());
        System.out.println(gt.getValue() instanceof Integer); // Integer인지 타입확인

        // 타입을 String으로 인스턴스를 생성
        GenericTest<String> gt2 = new GenericTest<>();

        gt2.setValue("판다");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof  String);
    }
}
