package chap06_class_and_object.com.section02.encapsulation.problem1;

public class Application1 {

    /* [문제점1] 필드에 올바르지 않은 값이 들어가도 통제가 불가능하다. */

    public static void main(String[] args) {
        Children children = new Children();
        children.name = "판다";
        children.age = 20;

        Children children1 = new Children();
        children1.name = "다람쥐";
        children1.age = -7;

        System.out.println("놀고 있는 어린이 : " + children.name + "(" + children.age + "세)");
        System.out.println("놀고 있는 어린이 : " + children1.name + "(" + children1.age + "세)");
    }
}
