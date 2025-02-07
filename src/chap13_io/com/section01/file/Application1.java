package chap13_io.com.section01.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        /* File 클래스의 사용 용법을 이해할 수 있다. */

        File file = new File("src/chap13_io/com/section01/file/test.txt");

        // 파일이 생성 되었는지?? true/false
        try {
            // 첫번째 실행은 생성되면서 true , 두번째 부터 이미 만들어 졌으므로 false
            boolean creatSuccess = file.createNewFile();
            System.out.println(creatSuccess);

        } catch (IOException e) {
            // throw new RuntimeException(e); 예외처리를 던지는데 출력을 하기위해
            e.printStackTrace(); // 출력구문
        }

        System.out.println("파일의 크기 : " + file.length() + " byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        /* [ 파일 내용 출력 ] */
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);  // 한 줄씩 출력
//            }
//        } catch (IOException e) {
//            System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
//        }

        /* [ 파일 삭제 ] */
        boolean deleteSuccess = file.delete();
        System.out.println(deleteSuccess); //파일 삭제 true/false
    }
}
