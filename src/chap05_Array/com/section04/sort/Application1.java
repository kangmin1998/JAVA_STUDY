package chap05_Array.com.section04.sort;

public class Application1 {
    public static void main(String[] args) {

        /* [ 변수의 두 값 변경하기 ] */
        int num1 = 10;
        int num2 = 20;
        int temp = 0;

        temp = num1; // temp : 10;  -> 값 하나를 따로 보관.
        num1 = num2; // num1 : 20;
        num2 = temp; // num2 : 10;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        /* 배열의 인덱스에 있는 값도 서로 변경할 수 있다. */
        int[] arr = {1, 2, 3};
        int temp2;

        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
