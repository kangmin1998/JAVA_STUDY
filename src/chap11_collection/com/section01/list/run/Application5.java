package chap11_collection.com.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /* [ Queue에 대해 이해하고 사용할 수 있다. ] */
        // 선입선출 FIFO(First In First Out)의 방식의 자료구조이다.

        // Queue는 인터페이스이므로 인스턴스 생성 불가
        // Queue<String> que = new Queue<>();

        // 주로 LinkedList 타입을 활용해서 큐를 만든다.
        Queue<String> que = new LinkedList<>();
        /* Queue에 데이터를 넣을 때는 offer() 메소드를 사용한다. */
        System.out.println("================offer()==================" + "\n");
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");
        System.out.println("Queue : " + que + "\n");

        /* Queue에서 데이터를 꺼내는 메소드는 크게 2가지가 있다. */
        // peek() : Queue의 가장 앞에 있는(먼저 들어온 요소를 반환)
        // poll() : Queue의 가장 앞에 있는(먼저 들어온 요소를 반환하고 제거)
        System.out.println("================peek()==================" + "\n");
        System.out.println("Queue.peek() : " + que.peek());
        System.out.println("Queue : " + que + "\n");

        // Queue에서 반환할 값이 없을 경우 null값이 반환 된다.
        System.out.println("================poll()==================" + "\n");
        System.out.println("Queue.poll() : " + que.poll());
        System.out.println("Queue : " + que + "\n");

    }
}
