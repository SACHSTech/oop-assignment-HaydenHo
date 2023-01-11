public class Song extends Media{
    private String title;
    private String artist;
    private int duration;
  
    public Song(String title, String artist, int duration) {
      this.title = title;
      this.artist = artist;
      this.duration = duration;
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
  }