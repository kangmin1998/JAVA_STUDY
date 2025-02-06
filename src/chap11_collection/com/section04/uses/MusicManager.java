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

    /* [ 곡 전체 조회 ] */

}
