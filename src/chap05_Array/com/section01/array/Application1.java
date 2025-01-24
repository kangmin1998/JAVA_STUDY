package chap05_Array.com.section01.array;

public class Application1 {
    public static void main(String[] args) {

        /*
            [ 배열 ]
            동일한 자료형의 묶음 (연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
            배열은 heap 영역에 new 연산자를 이용하여 할당한다.
            하나의 이름으로 관리되는 연속된 메모리 공간이고, 공간마다 찾아갈 숭 있는 번호(인덱스)를 이용해 접근한다.
         */

        /* [ 배열의 선언 및 할당 ] */
        int[] arr = new int[5];  // int arr1[] = new int[10]; 동일한 방법.

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int value = 0;
        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = value += 10;
        }

        int sum2 = 0;

        sum2 += arr[0];
        sum2 += arr[1];
        sum2 += arr[2];
        sum2 += arr[3];
        sum2 += arr[4];

        System.out.println("sum2 : " + sum2);

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum : " + sum);











    }
}
