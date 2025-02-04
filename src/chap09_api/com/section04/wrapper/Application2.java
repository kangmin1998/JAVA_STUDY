package chap09_api.com.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {

        // parsing : 문자열 값을 기본으로 자료형 값으로 변경하는 것을 parsing 이라고 한다.

        // 해당 자료형으로 paring 될 수 없는 문자열이 제공 되면 Exception이 발생한다.
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");
        float f = Float.parseFloat("4.0f");
        double d = Double.parseDouble("8.0");
        boolean b1 = Boolean.parseBoolean("true");
        // Character 는 parsing 기능을 제공하지 않는다.
        char c1 = "abc".charAt(0);
        char c2 = "abc".charAt(1);
        char c3 = "abc".charAt(2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
