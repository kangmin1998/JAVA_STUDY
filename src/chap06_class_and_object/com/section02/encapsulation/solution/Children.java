package chap06_class_and_object.com.section02.encapsulation.solution;

public class Children {
    String name;
    int age;

    public void setName(String name) {
        /* [ this ] */
        // this는 인스턴스 변수가 생성 되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
        // 지역변수와 전역변수의 이름이 동일한 경우 지역 변수를 우선적으로 접근하기 때문에
        // 전역 변수에 접근하기 위해서는 this.을 명시해야 한다.
        this.name = name;
    }


    public void setAge(int age) {
        if (age < 0) {
            System.out.println("잘못된 나이 정보입니다.");
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return this.name;
    }
}
