import java.util.ArrayList;
public class SpotifyList {
    private ArrayList<Song> songList = new ArrayList<Song>();
    private ArrayList<Podcasts> podcastList = new ArrayList<Podcasts>();

    Song Sunroof = new Song("Sunroof", "Nicky Youre, dazy", 169);
    Song AsItWas = new Song("As It Was", "Harry Styles", 167);
    Song CallMeMaybe = new Song("Call Me Maybe", "Carley Rae Jepsen", 193);
    Song ThinkingOutLoud = new Song("Thinking Out Loud", "Ed Sheeran", 281);
    Song Enemy = new Song("Enemy", "Imagine Dragons", 173);

    Podcasts JoeRogan = new Podcasts("The Joe Rogan Experience", "Podcasts", "January 10",  "Joe Rogan", 142);
    Podcasts TEDTalk = new Podcasts("Ted Talks Daily", "Postcasts", "January 10", "TED", 29);
    Podcasts IceCoffee = new Podcasts("The Iced Coffee Hour", "Podcasts", "January 9", "Graham Stephen/Jack Selby", 66);
    Podcasts OffThePill = new Podcasts("Off The Pill", "Podcasts", "December 15", "Higa TV", 51);
    Podcasts JordanPeterson = new Podcasts("The Jordan B. Peterson Podcast", "Podcasts", "January 9", "Dr. Jordan B. Peterson", 114);


    public SpotifyList(){
        songList.add(Sunroof);
        songList.add(AsItWas);
        songList.add(CallMeMaybe);
        songList.add(ThinkingOutLoud);
        songList.add(Enemy);

        podcastList.add(JoeRogan);
        podcastList.add(TEDTalk);
        podcastList.add(IceCoffee);
        podcastList.add(OffThePill);
        podcastList.add(JordanPeterson);
        

    }

    public void getSong(){
        System.out.println("Song");
        for(int i = 0; i < songList.size(); i++){
            System.out.println((i + 1) + ". " + songList.get(i).getName());
        }
        System.out.println();

        System.out.println("--Podcasts--");
        for(int i = 0; i < podcastList.size(); i++){
            System.out.println((i + 6) + ". " + podcastList.get(i).getName());
        }
    }
    
    public void getFilms(){
        System.out.println("--Songs--");
        for(int i = 0; i < songLis.size(); i++){
            System.out.println((i + 1) + ". " + songList.get(i).getName());
        }
        System.out.println();

        System.out.println("--Spotify--");
        for(int i = 0; i < podcastList.size(); i++){
            System.out.println((i + 6) + ". " + podcastList.get(i).getName());
        }
    }
      /**
     * Method to get songs from the song list
     * 
     * @param i used to indicate movie number
     * @return the user's desired movie
     */

    public Song getSong(int i){
        return songList.get(i);
    }

    /**
     * Method to get podcasts from the show list
     * 
     * @param i used to indicate show number
     * @return the user's desired show
     */
    public Podcasts getPodcasts(int i){
        return podcastList.get(i);
}
