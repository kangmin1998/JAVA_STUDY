package chap13_io.com.section03.filterstream;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /* [ DataInputStream , DataOutputStream ] */
        // 데이터 입출력 보조 스트림

        // 이 방법은 finally -> close()를 이용하여 닫지 않아도 된다.
        // try 구문을 빠져나오면 자동으로 닫아준다.
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("src/chap13_io/com/section03/filterstream/score.txt"))) {

            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');

            dout.writeUTF("김철수");
            dout.writeInt(73);
            dout.writeChar('C');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("src/chap13_io/com/section03/filterstream/score.txt"))) {

            // 파일에 기록한 순서대로 읽어오지 않는 경우 에러가 발생하거나 의미 없는 데이터를 읽어온다.
            while(true) {
                System.out.println(din.readUTF());
                System.out.println(din.readInt());
                System.out.println(din.readChar());

            }

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }catch (EOFException e) { // IOFException의 후손이므로 IOFException보다 위에 작성 되어야 한다.
            System.out.println("파일 읽기 완료!");
            // **EOFException**은 파일을 읽을 때 **파일 끝(EOF)**에 도달했을 때 발생하는 예외입니다.
        }
        catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            // IOException**은 입출력 과정에서 발생할 수 있는 예외를 처리합니다. 예를 들어, 파일이 없거나 읽기/쓰기가 불가능할 때 발생할 수 있습니다.
        }
    }
}
