public class Song extends Media{
    private String strTitle;
    private String strArtist;
    private int intDuration;
    private int intTotalListener;
  
    public Song(String title, String artist, int duration, int TotalListener) {
      super(title, artist, artist, artist, duration, TotalListener);
      this.strTitle = title;
      this.strArtist = artist;
      this.intDuration = duration;
      this.intTotalListener = TotalListener;
    }
  
    public String getTitle() {
      return this.strTitle;
    }
  
    public void setTitle(String title) {
      this.strTitle = title;
    }
  
    public String getArtist() {
      return this.strArtist;
    }
  
    public void setArtist(String artist) {
      this.strArtist = artist;
    }
  
    public int getDuration() {
      return this.intDuration;
    }
  
    public void setDuration(int duration) {
      this.intDuration = duration;
    }

    public int getListeners() {
      return this.intTotalListener;
    }

    public void setListeners() {
      this.intTotalListener = intTotalListener;
    }
    public int TotalListeners() {
      return (getListeners() / getDate());
    }
   
  }