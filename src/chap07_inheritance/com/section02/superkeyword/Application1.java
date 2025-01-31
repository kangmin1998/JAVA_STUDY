package chap07_inheritance.com.section02.superkeyword;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        /* [ Product 기본생성자 ] */
        Product product1 = new Product(); // 자료별 초기화...
        System.out.println(product1.getInfomation());
        System.out.println("============================================================");

        /* [ Product 매개변수 생성자 ] */
        Product product2 = new Product("S-03124", "삼성", "갤럭시", 2360000, new Date());
        System.out.println(product2.getInfomation());
        System.out.println("============================================================");

        Computer computer = new Computer();
        System.out.println(computer.getInfomation());
        System.out.println("============================================================");

        Computer computer1 = new Computer("스냅드래곤", 512, 16, "안드로이드");
        System.out.println(computer1.getInfomation());
        System.out.println("============================================================");

        /* [ Product, Computer 모든 필드 초기화 생성자 ] */
        Computer computer2 = new Computer("S-03124", "삼성", "갤럭시", 2360000, new Date(),
                "스냅드래곤", 512, 16, "안드로이드" );
        System.out.println(computer2.getInfomation());

    }
}
