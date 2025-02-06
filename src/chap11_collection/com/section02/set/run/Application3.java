package chap11_collection.com.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /* [ TreeSet에 대해 이해하고 사용할 수 있다. ] */
        // 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
        // 자동으로 오름차순 정렬을 한다.
        // 즉, Set이 가진 특징인 중복은 허용하지 않지만, 오름차순 정렬을 유지한다.

        // 값을 넣으면 자동으로 이진트리 형태로 값이 들어감.
        TreeSet<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");
        System.out.println("============add() 자동 오름차순=============" + "\n");
        System.out.println("tset : " + tset + "\n");

        // 정렬, 중복제거 특징을 이용하여 로또 번호 발생기 만들기
        System.out.println("================로또번호================" + "\n");
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println("looto : " + lotto);
    }
}
