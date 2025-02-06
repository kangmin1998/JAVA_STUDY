package chap11_collection.com.section04.uses;

public class DesecTitle implements java.util.Comparator<MusicDTO> {

    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
