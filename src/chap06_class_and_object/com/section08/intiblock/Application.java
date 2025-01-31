package chap06_class_and_object.com.section08.intiblock;

public class Application {
    public static void main(String[] args) {

        /* [ 기본 생성자로 인스턴스(객체) 생성 ] */
        Product product = new Product();
        System.out.println(product.getInfomation());

        /* [ 매개변수 생성자로 인스턴스(객체) 생성 ] */
        Product product2 = new Product("대륙폰", 500000,"샤오미");
        System.out.println(product2.getInfomation());
    }
}
