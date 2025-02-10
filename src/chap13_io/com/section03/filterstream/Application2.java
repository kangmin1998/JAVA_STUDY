package chap13_io.com.section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) throws IOException {

        /* [ InputStreamReader, OutStreamWriter ] */
        // 형변환 보조 스트림
        // 기본 스트림이 byte 기반이고, 보조 스트림이 char 기반 스트림인 경우 사용한다.


        /* [ 표준 스트림 ] */
        // 자바에서는 콘솔이나 키보드 같은 표준 입출력장치로부터 데이터를 입출력하기 위한 스트림을
        // 표준 스트림의 형태로 제공하고 있다. System 클래스의 필드 in, out가 대상 데이터의 스트림을 의미한다.
        // System.in(InputStream) : 콘솔로부터 데이터를 입력받는다.
        // System.out(printStream) : 콘솔로 데이터를 출력한다.
        // 즉, 자주 사용되는 자원에 대해 미리 스트림을 생성해 주었기 때문에 개발자가 별도로 스트림을 생성하지 않아도 된다.

        // System.in을 InputStreamReader로 변환하여 바이트기반 스트림을 문자 기반 스트림으로 변환 후
        // 버퍼를 이용한 보조스트림과 연결함
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            // 사용자에게 이름을 입력하라고 메시지를 출력
            System.out.print("문자열 입력 : ");
            String value = br.readLine();

            // 입력된 이름을 출력
            System.out.println("입력 받은 문자열 : " + value);

        } catch (IOException e) {
            // 예외 처리
            e.printStackTrace();
        }
//        finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    // throw new RuntimeException(e);
//                    e.printStackTrace();
//                }
//            }
//        }

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write("java, mysql, jdbc");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            if(bw != null) {
//                try {
//                    bw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}

