public class Song extends Media{
    private String title;
    private String artist;
    private int duration;
    private Album album;
  
    public Song(String title, String artist, int duration, Album album) {
      this.title = title;
      this.artist = artist;
      this.duration = duration;
      this.album = album;
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
  
    public int getDuration() {
      return this.duration;
    }
  
    public void setDuration(int duration) {
      this.duration = duration;
    }
  
    public Album getAlbum() {
      return this.album;
    }
  
    public void setAlbum(Album album) {
      this.album = album;
    }
  }