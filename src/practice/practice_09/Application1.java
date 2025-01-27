package practice.practice_09;

public class Application1 {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Python Basics", "Jane Smith", "LearnIt");
        System.out.println("2번 정답");
        b1.printBookInfo1();

        BookDTO b2 = new BookDTO("C++ Mastery", "Alice Brown", "CodeWorld", 45000, 0.20);
        System.out.println("3번 정답");
        b2.printBookInfo2();

        BookDTO b3 = new BookDTO();
        b3.setTitle("Java Programming");
        b3.setAuthor("John Doe");
        b3.setPublisher("Tech Books");
        b3.setPrice(30000);
        b3.setDiscountRate(0.15);

        System.out.println(b3.getprintBookInfo());
    }
}
