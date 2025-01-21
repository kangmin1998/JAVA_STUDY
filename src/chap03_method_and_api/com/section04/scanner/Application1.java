package chap03_method_and_api.com.section04.scanner;

import java.util.Date;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* [ Scanner 객체 생성 ] */

        Scanner sc = new Scanner(System.in);

        /* [ 자료형별 값 입력 받기 ] */

        /*
            nextLine() : 문자열 입력 받기(입력받은 값을 문자열로 반환해줌)
         */
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("입력한 이름은 : " + name + " 입니다.");

        /*
            nextInt() : 정수형 값 입력 받기(입력받은 값을 int 형으로 반환해줌)
         */
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력한 나이는 : " + age + " 입니다.");

        /*
            nextLong() : 정수형 값 입력 받기(입력받은 값을 Long 형으로 반환해줌)
         */
        System.out.print("희망하는 연봉을 입력하세요 : ");
        long pay = sc.nextLong();
        System.out.println("입력하신 페이는 : " + pay + " 입니다.");

        /*
            nextFloat() : 실수형 값 입력 받기(입력받은 값을 Float 형으로 반환해줌)
         */
        System.out.print("키를 입력하세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 : " + height + " 입니다.");

        /*
            nextDouble() : 실수형 값 입력 받기(입력받은 값을 Double 형으로 반환해줌)
         */
        System.out.print("키를 다시 입력하세요 : ");
        double height2 = sc.nextDouble();
        System.out.println("입력하신 키는 : " + height2 + " 입니다.");

        /*
            nextBoolean() : 논리형 값 입력 받기(true/false)만 입력받을 수 있음
         */
        System.out.print("나는 부자다 : ");
        boolean isRich = sc.nextBoolean();
        System.out.println("입력한 논리값은: " + isRich + " 입니다.");

        // sc.nextLine();

        /* [ 문자형 값 입력받기 ] */
        System.out.printf("좋아하는 알파벳을 입력하세요 : " );
        char alphabet = sc.nextLine().charAt(0);
        System.out.println("입력한 알파벳은 " + alphabet + " 입니다.");

        sc.close();


    }
}
