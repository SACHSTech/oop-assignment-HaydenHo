public class Podcasts extends Media {
    private String title;
    private String mediaArtist;
    private int mediaDuration;
    private String mediaName;
   
    public Podcasts(String mediaName, String mediaType, String mediaDate, String mediaArtist, int mediaDuration) {
        super(mediaName, mediaType, mediaDate, mediaArtist, mediaDuration);
      this.mediaName = mediaName;
      this.mediaArtist = mediaArtist;
      this.mediaDuration = mediaDuration;
      
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
