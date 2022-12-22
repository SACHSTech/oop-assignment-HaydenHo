public class UserPlaylist {
    private String name;
    private List<Song> songs;
  
    public UserPlaylist(String name, List<Song> songs) {
      this.name = name;
      this.songs = songs;
    }
  
    public String getName() {
      return this.name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public List<Song> getSongs() {
      return this.songs;
    }
  
    public void setSongs(List<Song> songs) {
      this.songs = songs;
    }
  
    
  
    public void removeSong(Song song) {
      this.songs.remove(song);
    }
  }