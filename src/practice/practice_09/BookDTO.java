package practice.practice_09;

public class BookDTO {
    private String title;
    private String author;
    private String publisher;
    private int price;
    private double discountRate;

    public BookDTO(){

    }

    public BookDTO(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public BookDTO(String title, String author, String publisher, int price, double discountRate) {
        this(title, author,publisher);
        this.price = price;
        this.discountRate = discountRate;
    }


    public void printBookInfo1() {
        System.out.println("도서 제목 : " + title + "저자 : " + author + "출판사 : " + publisher);
    }

    public void printBookInfo2() {
        System.out.println("도서 제목 : " + title + "저자 : " + author + "출판사 : " + publisher + "가격 : " + price + "원" + "할인율 : " + discountRate);
    }

    public String getprintBookInfo(){
        return "도서 제목 : " + title + "저자 : " + author + "출판사 : " + publisher + "가격 : " + price + "할인율 : " + discountRate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}