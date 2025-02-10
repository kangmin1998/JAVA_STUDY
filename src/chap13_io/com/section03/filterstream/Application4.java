package chap13_io.com.section03.filterstream;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {
        /* [ ObjectInputStream/ ObjectOutputStream ] */
        // 객체 단위 입출력 보조 스트림

        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "Hong174@gmail.com", 25, '남', 1235.7),
                new MemberDTO("user02", "pass02", "유관순", "yoo153@gmail.com", 16, '여', 1235.7),
                new MemberDTO("user03", "pass03", "이순신", "lee135@gmail.com", 41, '남', 1235.7)
        };
        try (ObjectOutputStream objOut = new ObjectOutputStream((new FileOutputStream("src/chap13_io/com/section03/filterstream/testObject.txt")))) {

            for (int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }

            // 직렬화란?
            // 자바 시스템 내부에서 사용되는 객체 또는 데이터 외부에서도 사용할 수 있도록 byte 형태로
            // 데이터를 변환하는 기술을 말한다.
            // 반대로 바이트 변환 된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다.

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        MemberDTO[] inputMembers = new MemberDTO[3];

        try (ObjectInputStream objIn = new ObjectInputStream((new FileInputStream("src/chap13_io/com/section03/filterstream/testObject.txt")))) {
            for (int i = 0; i < inputMembers.length; i++) {
                inputMembers[i] = (MemberDTO) objIn.readObject();
            }

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        for(MemberDTO member : inputMembers){
            System.out.println(member);
        }
    }
}