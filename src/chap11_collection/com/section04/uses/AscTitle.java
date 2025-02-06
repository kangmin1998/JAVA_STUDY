package chap11_collection.com.section04.uses;

public class AscTitle implements java.util.Comparator<MusicDTO> {

    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
