package chap11_collection.com.section04.uses;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MusicManager {

    private List<MusicDTO> musicList;

    /* [ 파일 로드 ] */
    public void fileLoad() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("musicList.dat"))) {
        } catch (FileNotFoundException e) {
            musicList = new ArrayList<>();
        } catch (IOException e) {
            musicList = new ArrayList<>();
        }
    }

    /* [ 파일 저장 ] */
    public void fileSave() {
        try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("musicList.dat"))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* [ 곡 추가 ] */
    public void addList(MusicDTO music) {
        musicList.add(music);
    }

    /* [ 곡 전체 조회 ] */
    public List<MusicDTO> selectList() {
        return musicList;
    }

    /* [ 가수명 조회 ] */
    public List<MusicDTO> searchArtist(String artist) {
        List<MusicDTO> searchArt = new ArrayList<>();

        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getArtist().contains(artist)) {
                searchArt.add(musicList.get(i));
            }
        }
        return searchArt;

    }

    /* [ 제목 조회 ] */
    public List<MusicDTO> searchTitle(String title) {
        List<MusicDTO> searchTit = new ArrayList<>();


        for(int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getArtist().contains(title)) {
                searchTit.add(musicList.get(i));
            }
        }
        return searchTit;
    }

    /* [ 곡 수정 ] */
    public boolean updateMusic(MusicDTO updateMusic) {
        List<MusicDTO> aaa = new ArrayList<>();
        for(MusicDTO music : musicList) {
            if ()
        }
        return false;
    }

    /* [ 곡 제거 ] */
    public boolean removeMusic(int id) {
        return false;
    }


}
