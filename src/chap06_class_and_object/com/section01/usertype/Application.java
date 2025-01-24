package chap06_class_and_object.com.section01.usertype;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 변수를 이용한 회원 데이터 관리 시 단점
         * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
         * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면
         * 너무 많은 값들을 인자로 전달해야 해서 한 눈에 안들어온다.
         * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.
         * (서로 다른 자료형들이기 때문)
         * */
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "볼링", "테니스"};
        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.print("hobby : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();


        /* [ 사용자 정의 자료형(=Class) 사용한 회원 데이터 관리 ] */
        /* [ 객체(instance) 생성 구문 ] */
        /*
            자료형 변수면 = new 클래스명();
            사용자 정의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap 영역에 할당해야 한다.
            객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성 된다.
         */
        Member member = new Member();

        /* [필드에 접근하기 위해서는 레퍼런스변수명. 으로 접근한다.] */
        /*
            '.'은 참조 연산자라고 하는데, 레퍼런스 변수가 참조하는 주소로 접근한다는 의미를 가진다.
         */

        System.out.println("Member.id : " + member.id);
        System.out.println("Member.pwd : " + member.pwd);
        System.out.println("Member.name : " + member.name);
        System.out.println("Member.age : " + member.age);
        System.out.println("Member.gender : " + member.gender);
        System.out.println("Member.hobby : " + member.hobby);

        /* 필드에 접근해서 값 대입 */
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "판다";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "당구"};

        System.out.println("Member.id : " + member.id);
        System.out.println("Member.pwd : " + member.pwd);
        System.out.println("Member.name : " + member.name);
        System.out.println("Member.age : " + member.age);
        System.out.println("Member.gender : " + member.gender);
        System.out.println("Member.hobby : " + Arrays.toString(hobby));

    }
}
