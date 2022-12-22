
public class Album {
  private String title;
  private String artist;
  private int year;
  private List<Song> songs;

  public Album(String title, String artist, int year, List<Song> songs) {
    this.title = title;
    this.artist = artist;
    this.year = year;
    this.songs = songs;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return this.artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  
  }
}