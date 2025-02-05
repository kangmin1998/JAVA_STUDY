package chap11_collection.com.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

    /* [ LinkedList에 대해 이해하고 사용할 수 있다. ] */

    List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("mango");
        linkedList.add("orange");
        linkedList.add("grape");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("인덱스" + i + " : " + linkedList.get(i));
        }
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println("============remove===========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("인덱스" + i + " : " + linkedList.get(i));
        }
        System.out.println(linkedList);

        linkedList.set(0, "peach");
        System.out.println("============set===========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("인덱스" + i + " : " + linkedList.get(i));
        }
        System.out.println(linkedList);
        System.out.println("빈 객체 확인 isEmpty() : " + linkedList.isEmpty());

        linkedList.clear();
        System.out.println("============clear===========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("인덱스" + i + " : " + linkedList.get(i));
        }
        System.out.println(linkedList);
        System.out.println("빈 객체 확인 isEmpty() : " + linkedList.isEmpty());


        /*
            LinkedList는 List 인터페이스를 상속 받아 ArrayList와 사용하는 방법이 유사하다.
            단, 내부적으로 요소를 저장하는 방법이 차이가 있는 것이다.
            따라서 각 컬렉션 프레임워크 클래스들의 특징을 파악하고 그에 따라 접합한 자료 구조를 구현한 클래스를 선택하는 것이 좋다.
         */
    }
}
