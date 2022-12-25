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
  
    public String getMediaArtist() {
      return this.mediaArtist;
    }
  
    public void setMediaArtist(String artist) {
      this.mediaArtist = artist;
    }
  
    public int getMediaDuration() {
      return this.mediaDuration;
    }
  
    public void setMediaDuration(int duration) {
      this.mediaDuration = duration;
    }
  
}
