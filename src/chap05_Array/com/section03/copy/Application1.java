package chap05_Array.com.section03.copy;

import java.sql.SQLOutput;

public class Application1 {
    public static void main(String[] args) {

        /* [ 얕은 복사 ( shallow copy ) ] */
        /*
            stack의 주소값만 복사한다.
            따라서 두 개의 레퍼런스 변수가 동일한 배열의 주소값을 가지므로,
            하나의 레퍼런스 변수에 저장된 주소값으로 배열의 내용을 수정하면,
            다른 레퍼런스 변수로 배열에 접근했을 때도 변경 사항이 반영된 값을 받는다.
        * */

        // int[] originArr = new int[5];
        // originArr[0] = 1;
        // originArr[1] = 2;
        // originArr[2] = 3;
        // originArr[3] = 4;
        // originArr[4] = 5;
        int[] originArr = {1, 2, 3, 4, 5};

        int[] copyArr = originArr;  // 얕은복사

        // 같은 주소값을 가지고 있다 -> ??? 당연히 한쪽에 값을 변경하면 값이 다 변경되지.
        System.out.println(originArr.hashCode());
        ;
        System.out.println(copyArr.hashCode());
        ;

        System.out.println("originArr[4] (before update) : " + originArr[4]);
        System.out.println("copyArr[4] (before update) : " + copyArr[4]);

        //originArr[4] = 90;
        copyArr[4] = 90;
        System.out.println("originArr[4] (after update) : " + originArr[4]);
        System.out.println("copyArr[4] (after update) : " + copyArr[4]);

        /* [ 얕은복사의 활용 ] */
        /*
            주로 메소드 호출 시 인자로 사용하는 경우와
            리턴값으로 동일한 배열을 반환하고 싶은 경우 사용한다.
         */

        // 인자와 매개변수로 활용
        String[] team = {"김동현", "강태민", "황재용", "진보경"}; // 얕은복사
        System.out.println("team 배열 hashCod : " + team.hashCode());
        printArr(team);
        printArr(team);

        // 리턴값으로 활용
        String[] arrFromMethod = getArr();
        System.out.println("getArr()로 반환 받은 배열 hashCode() " + arrFromMethod.hashCode());

    }


    public static void printArr(String[] arr) { // 얕은복사
        /* [ 얕은복사의 활용 ] */
        /*
            주로 메소드 호출 시 인자로 사용하는 경우와
            리턴값으로 동일한 배열을 반환하고 싶은 경우 사용한다.
         */
        System.out.println("printArr() 매개변수 hachcode() : " + arr.hashCode());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            arr[i] += "님";
        }
        System.out.println();
    }

    public static String[] getArr() {
        String[] lunch = new String[]{"김치찌개", "공기밥", "물"};

        System.out.println("getArr()의 배열 hashCode() : " + lunch.hashCode());

        return lunch;
    }

}
