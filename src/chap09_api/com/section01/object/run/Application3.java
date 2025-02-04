package chap09_api.com.section01.object.run;

import chap09_api.com.section01.object.book.Book;

public class Application3 {
    // Object 클래스의 hashCode() 메소드 오버라이딩 목정을 이해하고 활용할 수 있다.
    // Object 클래스의 명세에 작성된 일반 규약에 따르면 equals() 재정의 시 반드시 hashCode()를
    // 재정의 하도록 되어 있다. 만약 hashCode()를 재정의 하지 않으면 같으 값을 가지는 동등 객체는 같으 해시코드 값을
    // 가져야 한다는 규약에 위반 된다. ( 강제성은 없지만 규약을 따르는 것이 좋다.)
    public static void main(String[] args) {
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(288, "홍길동전", "허균", 50000);

        // 동등 객체지만 동일 객체는 아니다.
        System.out.println("book1.hashCode() : " + book1.hashCode());
        System.out.println("book2.hashCode() : " + book2.hashCode());

        // 객체를 만들고 그 객체 안에 값을 사용하려면 get을 사용해야하네.....ㅁ우냐ㅐㅜㅇㄹ재누려ㅐㅑㅏ
        // 어제 궁금증 거의다 풀림...
        int numAdd = book2.getNumber() +2;
        System.out.println(numAdd);

    }
}
