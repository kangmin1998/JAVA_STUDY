package chap11_collection.com.section04.uses;

public class DesecArtist implements java.util.Comparator<MusicDTO> {
    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {
        return o2.getArtist().compareTo(o1.getArtist());
    }
}
