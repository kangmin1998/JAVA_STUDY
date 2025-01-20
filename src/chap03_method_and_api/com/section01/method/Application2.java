package chap03_method_and_api.com.section01.method;

public class Application2 {
    public static void main(String[] args) {
        /*
            [ 메소드 호풀 구조 이해하기 2 ]
        */
        System.out.println("파티시작~ (main() start)");
        Application2 app1 = new Application2();
        app1.methodA();
        app1.methodC();
        app1.methodB();
        System.out.println("파티 끝~ (main() end)");
    }
    public void methodA(){
        System.out.println("동현님을 조심스럽게 초대합니다.");

        System.out.println("동현님이 조심스럽게 돌아갑니다.");
    }
    public void methodB(){
        System.out.println("민지님을 조심스럽게 초대합니다.");

        System.out.println("민지님이 조심스럽게 돌아갑니다.");
    }
    public void methodC(){
        System.out.println("유찬님을 조심스럽게 초대합니다.");

        System.out.println("유찬님이 조심스럽게 돌아갑니다.");
    }
}
