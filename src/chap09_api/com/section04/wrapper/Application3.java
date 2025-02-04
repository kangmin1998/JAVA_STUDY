package chap09_api.com.section04.wrapper;

public class Application3 {
    public static void main(String[] args) {

        // parsing 과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요하다.
        // ValueOf() : 기본 자료형 값을 Wrapper 클래스 타입으로 변환시키는 메소드
        // toString() : 필드값 문자열로 반환하는 메소드

        String b = Byte.valueOf((byte)1).toString();
        String i = Integer.valueOf(4).toString();
        String c = Character.valueOf('a').toString();

        // String 클래스의 valueOf를 사용할 수도 있다.
        String str = String.valueOf(10);

        // 문자열 합치기를 이용해 String 으로 변환할 수도 있다.
        String str2 = 123 + "";
    }
}
