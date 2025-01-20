package chap01.com.section01.literal
        ;

public class Application1 {
    public static void main(String[] args) {
        // 정수 형태의 값 출력
        System.out.println(123);    // sout 입력하면 자동완성 된다.

        // 실수 형태의 값 출력
        System.out.println(1.23);

        // 문자 형태의 값 출력
        System.out.println('a');    // 문자 형태의 값은 홑따옴표로 감싸주어야 한다.
//      System.out.println('ab');   두 개 이상의 문자는 취급하지 않기 때문에 에러가 발생한다.
//      System.out.println('');     아무 문자도 기록되지 않은 경우도 에러 발생
        System.out.println('1');    // 숫자 값이지만 홑따옴표로 감싸져있는 경우 문자 '1' 이라고 판단한다.

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");     // 문자열은 문자 여러개가 나열된 형태를 말하며 쌍따옴표로 감싸주어야 한다.
        System.out.println("123");          // 문자열 : 123
        System.out.println("");             // 문자열은 입력하지 않아도 에러가 안난다.
        System.out.println("a");            // 한개의 문자도 쌍따옴표로 감싸면 문자열이다.

        // 논리 형태의 값 출력 (true, false)
        System.out.println(true);
        System.out.println(false);





    }
}
