package practice.practice_10;

import chap06_class_and_object.com.section09.objectArray.Car;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] studentDTOS = new StudentDTO[10];
        int num;
        int num1 = 0;
        while (num1 != 2) {
            System.out.print("학년 : ");
            int gra = sc.nextInt();
            System.out.print("반 : ");
            int clas = sc.nextInt();
            System.out.print("이름 : ");
            String nam = sc.next();
            System.out.print("국어점수 : ");
            int ko = sc.nextInt();
            System.out.print("영어점수 : ");
            int en = sc.nextInt();
            System.out.print("수학점수 : ");
            int ma = sc.nextInt();
            // System.out.println("계속 추가할 겁니까 ? (y/n)");
            // num = sc.nextInt();
            studentDTOS[0] = new StudentDTO(gra, clas, nam, ko, en, ma);
            num1++;

            System.out.print("계속 추가할 겁니까 ? (y/n): ");
            String continueInput = sc.next();
            if (continueInput.equalsIgnoreCase("n")) {
                break;
            }


        }


        System.out.println(" ====== 학생정보 ====== ");
        for (StudentDTO studentDTO : studentDTOS) {
            System.out.println(studentDTO.getInformation());
        }

    }
}
