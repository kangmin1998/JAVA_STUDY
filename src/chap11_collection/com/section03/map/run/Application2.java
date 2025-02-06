package chap11_collection.com.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /* [ Properties에 대해 이해하고 사용할 수 있다. ] */
        System.out.println("================setProperty()==================" + "\n");
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://local/menu");
        prop.setProperty("user", "com");
        prop.setProperty("password", "com");
        System.out.println(prop + "\n");

        // Properties 객체의 값을 파일로 출력
        try {
            prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");

        } catch (FileNotFoundException e) { // 예외처리 한거임 안하면 try 오류뜸
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /* [ 파일로부터 읽어와서 Properties 객체 담기 ] */
        Properties prop2 = new Properties();

        try {
            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));

            prop2.list(System.out);

        } catch (IOException e) { // 예외처리 한거임 안하면 try 오류뜸
            e.printStackTrace();
        }


        System.out.println("\n" + "================getProperty()==================" + "\n");
        System.out.println(prop2.getProperty("driver"));
        System.out.println(prop2.getProperty("url"));
        System.out.println(prop2.getProperty("user"));
        System.out.println(prop2.getProperty("password"));

    }
}
