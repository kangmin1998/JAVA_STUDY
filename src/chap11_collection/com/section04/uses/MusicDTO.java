package chap11_collection.com.section04.uses;

public class MusicDTO {

    private int id;
    private String artist;
    private String title;

    public MusicDTO() {
    }

    public MusicDTO(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public MusicDTO(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MusicDTO{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
