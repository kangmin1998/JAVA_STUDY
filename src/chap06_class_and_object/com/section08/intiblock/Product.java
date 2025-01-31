package chap06_class_and_object.com.section08.intiblock;

public class Product {

    // private String name;
    // private int price;
    // private static String brand;

    /* [명시적 초기화] */
    private String name = "갤럭시";
    private int price = 100000;
    private static String brand = "삼성";

    /* [ 초기화 블럭 ] */

    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 800000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함...");
    }

    static {
        // static 초기화 블럭에서는 non-static 필드를 초기화 할 수 없다.
        // 정적 초기화 블럭 동작 시에는 인스턴스가 존재하지 않기 때문이다.
        brand = "엘지";
        System.out.println("static 초기화 블럭 동작함...");
    }

    /* [ 기본 생성자 ] */
    public Product(){
        System.out.println("기본생성자 호출됨..");
    }
    /* [ 매개변수 있는 생성자 ] */
    public Product(String name, int price, String brand){
        this.name = name;
        this.price = price;
        this.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Product.brand = brand;
    }

    public  String getInfomation(){
        return "Product[name= " + this.name + ", price = " + this.price + ", brand = " + Product.brand + "]";
    }


}
