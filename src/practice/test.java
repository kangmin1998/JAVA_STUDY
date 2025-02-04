package practice;

public class test {


    // 화면을 덮어쓰는 함수
    public static void clearScreen() {
        System.out.print("\r" + " ".repeat(100)); // 현재 라인을 공백으로 덮어쓰기
    }

    public static void main(String[] args) {
        // 화면을 덮어쓰는 효과를 주는 예시
        for (int i = 0; i < 10; i++) {
            clearScreen();  // 화면 덮어쓰기
            System.out.print("Clearing screen... " + i);
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





