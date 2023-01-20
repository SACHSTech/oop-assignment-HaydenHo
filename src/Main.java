import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
    // Setting Variable and object 
    String strUser;
    String strChoice;
    int intSong;
    int intSlot;
    Scanner sc = new Scanner(System.in);        
    boolean blnMenu = true;
    boolean blnList = false;
    ArrayList<String> MediaList = new ArrayList<String>();
    ArrayList<String> genreList = new ArrayList<String>();
    ArrayList<Media> objMediaList = new ArrayList<Media>();

    SpotifyList newSpotifyList = new SpotifyList();

    System.out.println("Welcome to your Spotify list! What is your name?:");
    strUser = sc.nextLine();
    System.out.println("Hi " + strUser + "! Here are your songs.");
    System.out.println();

    
    }
}
