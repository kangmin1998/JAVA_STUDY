package chap05_Array.com.section04.sort;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* [순차정렬 알고리즘] */

        /* 오름차순으로 정렬 */
        /*
            배열의 첫 인덱스부터 마지막 전 인덱스까지 반복하는 반복문
            마지막 인덱스는 자연스럽게 정렬되므로 처리할 필요가 없다.
         */
        int[] arr = {5, 2, 9, 7, 1, 3, 8, 4, 6};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // arr[i] < arr[j] <- 내림차순!
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // Arrays.toString(arr) 이용히여 배열 출력하자!!!
            System.out.println(i + "번 인덱스 정렬 완료 : " + Arrays.toString(arr));
        }
        System.out.println("정렬완료 : " + Arrays.toString(arr));
        // for문으로 출력을 할 수 있다.
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
