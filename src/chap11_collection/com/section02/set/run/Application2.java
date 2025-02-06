package chap11_collection.com.section02.set.run;

import java.util.LinkedHashSet;

public class Application2 {
    public static void main(String[] args) {

        /* [ LinkedHashSet에 대해 이해하고 사용할 수 있다. ] */
        // HashSet의 기능을 모두 가지고 있고, 추가적으로 저장 순서를 유지하지만 중복은 하지 않는다.
        // 순서대로는 되지만 중복X

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("mysql");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");
        System.out.println("================add()==================" + "\n");
        System.out.println("lhset : " + lhset + "\n");

        System.out.println("================add() 중복값 추가 여부==================" + "\n");
        lhset.add("java");
        System.out.println("lhset.add(\"java\") : " + lhset + "\n");

    }
}
