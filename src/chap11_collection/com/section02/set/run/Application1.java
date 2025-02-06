package chap11_collection.com.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /* [ HashSet 클래스를 이해하고 사용할 수 있다. ] */

        /* HashSet 인스턴스 생성 */
        HashSet<String> hset = new HashSet<>();

        // 다형성 적용하여 상위 인터페이스를 타입으로 사용 가능
        Set<String> hset2 = new HashSet<>();

        // Set 계열에 데이터 추가 시 add 메소드 사용
        hset.add(new String("java"));
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));
        System.out.println("================add()==================" + "\n");
        System.out.println("hest : " + hset + "\n");

        System.out.println("================add() 중복값 추가 여부==================" + "\n");
        // 중복 값이 저장되지 않는다. 동일 객체(주소 값 일치) 뿐 아니라
        // 동등 객체(필드 값 일치)도 중복 값으로 판단 된다.
        // String 클래스에 equals()와 hashCode()가 오버라이딩 되어 있기 때문이다.
        hset.add(new String("java")); // add()를 사용해 java추가 했지만 추가되지 않는다.
        System.out.println("hest : " + hset + "\n");

        System.out.println("================contains()==================" + "\n");
        // contains() 메소드로 해당 객체를 포함하고 있는지 확인할 수 있다.
        System.out.println("hset.contains(\"html\") : " + hset.contains("html") + "\n");
        System.out.println("hest : " + hset + "\n");

        /*
            저장 된 객체를 인덱스 기준으로 순회할 수 없고, 반복문을 이용한 연속처리 방법으로는
            1. toArray() 메소드로 배열로 변경한 뒤 for loop 사용
            2. iterator() 메소드로 반복자를 만들어서 연속 처리
         */

        System.out.println("================배열로 바꿔 인덱스 확인==================" + "\n");
        Object[] arr = hset.toArray(); // 배열로 바꿔주기
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }
        System.out.println();

        // Collection 인터페이스의 상위 타입인 Iterable 인터페이스에 iterator() 메소드가 정의 되어 있다.
        // 따라서 Collection 타입이라면 반복자를 통한 순회를 할 수 있다.
        System.out.println("========Iterator를 사용하여 모든 요소를 순차적으로 출력========" + "\n");
        // Iterator를 사용하여 모든 요소를 순차적으로 출력
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
