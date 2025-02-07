package chap13_io.com.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /* [ FileWriter ] */
        /*
            프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
            1글자 단위로 데이터를 처리한다.
         */

        FileWriter fw = null;
        try {
            fw = new FileWriter("src/chap13_io/com/section02/stream/testFileWriter.txt");

            fw.write(97);
            fw.write('A');
            fw.write(10);

            // char 배열도 가능
            fw.write(new char[]{'a', 'b', 'c', 'd', 10});

            // 문자열도 가능
            fw.write("우리나라 대한민국");

        }
//        catch (FileNotFoundException e) {
//            //throw new RuntimeException(e);
//            e.printStackTrace();
        catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    //throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }
        }
    }
}
