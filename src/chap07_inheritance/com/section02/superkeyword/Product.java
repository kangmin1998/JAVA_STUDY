package chap07_inheritance.com.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturingDate;

    // 기본 생성자
    public Product() {
        System.out.println("Product 클래스의 기본 생성자 호출...");
    }
    // 모든 필드를 초기화 하는 매개변수 생성자
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        System.out.println("Product 클래스의 매개변수 생성자 호출...");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getInfomation(){
        return "product[code = " + code + ", brand = " + brand + ", name = " + name + ", price = " + price + ", manufacturingDate = " + manufacturingDate + "]";
    }
}
