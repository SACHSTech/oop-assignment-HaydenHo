public class Song extends Media{
    private String strTitle;
    private String strArtist;
    private int intDuration;
  
    public Song(String title, String artist, int duration) {
      super(title, artist, artist, artist, duration);
      this.stritle = title;
      this.strArtist = artist;
      this.intDuration = duration;
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