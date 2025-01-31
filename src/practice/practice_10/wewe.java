package practice.practice_10;

public class wewe {
    public static void main(String[] args) {

        package practice.practice_10;

import java.util.Scanner;

        public class Application {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num1 = 0;  // 학생 입력 카운트
                StudentDTO[] studentDTOS = new StudentDTO[10];  // 10명의 학생 정보를 저장할 배열

                while (num1 < 10) {
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

                    // 학생 정보를 배열에 저장
                    studentDTOS[num1] = new StudentDTO(gra, clas, nam, ko, en, ma);
                    num1++;

                    // 계속 입력할지 여부 확인
                    System.out.print("계속 추가할 겁니까 ? (y/n): ");
                    String continueInput = sc.next();
                    if (continueInput.equalsIgnoreCase("n")) {
                        break;
                    }
                }

                // 모든 학생 정보 출력
                System.out.println("\n학생 정보:");
                for (StudentDTO studentDTO : studentDTOS) {
                    if (studentDTO != null) {  // null인 항목이 있을 수 있으므로 체크
                        System.out.println(studentDTO.getInformation());
                    }
                }
            }
        }

    }
}
