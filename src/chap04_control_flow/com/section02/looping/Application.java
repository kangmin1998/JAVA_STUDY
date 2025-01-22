package chap04_control_flow.com.section02.looping;

public class Application {
    public static void main(String[] args) {

        // 객체 생성
        A_for a = new A_for();
        //a.simpleForStatement();
        //a.testForExample1();
        //a.star();
        //a.testForExample2();
        //a.testForExample3();
        //a.testForExample4();

        B_nestedFor b = new B_nestedFor();
        //b.printGugudan();
        //b.printStarInputRow();
        //b.star();
        //b.printStarTraining();

        C_while c = new C_while();
        //c.simpleWhileStatement();
        //c.testWhileSample1();
        //c.testWhileSample2();
        c.testWhileSample3();

        D_doWhile d = new D_doWhile();
        //d.simpleDoWhileStatement();
        //d.testDoWhileSample();

    }

}
