package chap13_io.com.section02.stream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {

        /* [ FileOutputStream ] */
        /*
            프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
            1바이트 단위로 데이터를 처리한다.

         */

        FileOutputStream fout = null;
        try {
            // OutputStream 의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
            fout = new FileOutputStream("src/chap13_io/com/section02/stream/testOutputStream.txt");

            fout.write(97);

            // 10 : 개행문자 (Enter)
            byte[] bar = new byte[] {98, 99, 100, 101, 10, 43};
            fout.write(bar);

            // 1번 인덱스부터 3의 길이만큼 파일에 내보내기
            fout.write(bar, 1, 3);

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }finally {
            if(fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    //throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }
        }

    }
}
