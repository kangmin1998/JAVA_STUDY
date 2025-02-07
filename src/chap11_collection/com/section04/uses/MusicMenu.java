package chap11_collection.com.section04.uses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicMenu {

    private Scanner sc = new Scanner(System.in);
    private MusicManager musicManager = new MusicManager();

    public void addList() {
        System.out.println("======== 곡 추가 =========");
        System.out.print("가수 입력 : ");
        String artist = sc.nextLine();
        System.out.print("제목 입력 : ");
        String title = sc.nextLine();

        musicManager.addList(new MusicDTO(artist, title));
    }

    public void selectList() {
        System.out.println("======== 곡 전체 조회 =========");
        List<MusicDTO> musicList = musicManager.selectList();

        if (!musicList.isEmpty()) {
            for (MusicDTO music : musicList) {
                System.out.println(music);
            }
        } else {
            System.out.println("목록이 존재하지 않습니다.");

        }
    }

    // 정렬에 대한 함수 함수
    public void sortMenu() {
        System.out.println("======== 정렬 메뉴 ========");
        System.out.println("1. 가수명 오름차순 정렬");
        System.out.println("2. 곡명 오름차순 정렬");
        System.out.println("3. 가수명 내림차순 정렬");
        System.out.println("4. 곡명 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();

        ascDesc(menu);
    }

    private void ascDesc(int menu) {
        System.out.println("======== 정렬하여 조회 ========");
        List<MusicDTO> musicList = musicManager.selectList();

        if (musicList.isEmpty()) {
            System.out.println("목록이 존재하지 않습니다.");
            return;
        }
        // 정렬 시 원본 데이터를 변경하므로 사본 데이터를 별도로 생성한다.
        List<MusicDTO> sortList = new ArrayList<>();
        sortList.addAll(musicList);

        switch (menu) {
            case 1:
                // 익명 클래스 사용
                sortList.sort(new Comparator<MusicDTO>() { // 익명 클래스
                    @Override
                    public int compare(MusicDTO o1, MusicDTO o2) {
                        return o1.getArtist().compareTo(o2.getArtist());
                    }
                });
                break;
            case 2:
                // Comparator를 상속한 클래스 사용
                sortList.sort(new AscTitle());
                break;
            case 3:
                sortList.sort(new DesecArtist());
                break;
            case 4:
                sortList.sort(new DesecTitle());
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }

        for (int i = 0; i < sortList.size(); i++) {
            System.out.println(sortList.get(i));
        }
    }

    public void searchArtist(){
        System.out.print("가수명 검색 : ");
        String search = sc.nextLine();
        List<MusicDTO> searchArtistlist = musicManager.searchArtist(search);

        for(int i = 0; i < searchArtistlist.size(); i++) {
            System.out.println(searchArtistlist.get(i));
        }

    }

    public void searchTitle() {
        System.out.print("곡명 검색 : ");
        String search = sc.nextLine();
        List<MusicDTO> searchTitle = musicManager.searchTitle(search);

        for(int i = 0; i < searchTitle.size(); i++) {
            System.out.println(searchTitle.get(i));
        }
    }

    public void updateMusic() {
        // 곡 전체 보여주기
        List<MusicDTO> musicList = musicManager.selectList();

        if (!musicList.isEmpty()) {
            for (MusicDTO music : musicList) {
                System.out.println(music);
            }
        } else {
            System.out.println("목록이 존재하지 않습니다.");
        }
        System.out.print("Id를 입력하세요.");
        int id = sc.nextInt();
        System.out.print("변경할 가수을 입력하세요 : ");
        String music = sc.nextLine();
        System.out.println("변경할 ");




    }


    public void mainMenu() {

        // FileLoad() 호출
        musicManager.fileLoad();

        mainMenu:
        while (true) {
            System.out.println("======== 메뉴 ========");
            System.out.println("1. 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 가수명으로 검색"); // Arraylist 메서드 활용 이름 포함되었나? contains
            System.out.println("5. 곡명으로 검색");   // Arraylist 서치 리스트 새로 만든다 = new arraylist
            System.out.println("6. 곡 정보 수정");  //
            System.out.println("7. 곡 삭제");      // remove
            System.out.println("8. 프로그램 종료");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();


            switch (menu) {
                case 1:
                    addList();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    sortMenu();
                    break;
                case 4:
                    searchArtist();
                    break;

                case 5:
                    searchTitle();
                    break;
                case 6:
                case 7:
                case 8:
                default:
                    System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
                    break;
            }
        }
    }

}
