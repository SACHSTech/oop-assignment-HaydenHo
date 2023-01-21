import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static BufferedReader keyboard;
    public static void main (String[] args) throws IOException {
    // Setting Variable and object 
    String strUser;
    String strChoice;
    int intMedia;
    int intSlot;
    Scanner sc = new Scanner(System.in);        
    boolean blnMenu = true;
    boolean blnList = false;
    ArrayList<String> mediaList = new ArrayList<String>();
    ArrayList<String> genreList = new ArrayList<String>();
    ArrayList<Media> objMediaList = new ArrayList<Media>();

    SpotifyList newSpotifyList = new SpotifyList();

    System.out.println("Welcome to your Spotify list! What is your name?:");
    strUser = sc.nextLine();
    System.out.println("Hi " + strUser + "! Here are your songs.");
    System.out.println();

    while(blnMenu){

        // Displays films
        newSpotifyList.getMedia();
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1. Browse Songs\n2. Customize Lists\n3 Exit");
        System.out.println();
        
        strChoice = sc.nextLine();
        switch(strChoice){
            case "1":
                System.out.println("Which song would you like to browse? (Type the number of the song): ");
                intMedia = sc.nextInt();
                sc.nextLine();
                System.out.println();

                // Gets movies and shows to display
                if(intMedia < 6){
                    System.out.println(newSpotifyList.getSong(intMedia - 1));
                }
                else if(intMedia > 5){
                    System.out.println(newSpotifyList.getPodcasts(intMedia - 6));
                }

                // Uses setter method to set film as "favourite"
                System.out.println("Type 'like' if you would like to like this media.\nType anything else to continue");
                if(sc.nextLine().equalsIgnoreCase("like")){
                    if(intMedia < 6 ){
                        newSpotifyList.getSong(intMedia - 1).setLike();
                    }
                    else if(intMedia > 5 && intMedia < 11){
                        newSpotifyList.getPodcasts(intMedia - 6).setLike();
                    }
                }
                break;

            case "2":
                System.out.println();
                System.out.println("Here is your list so far: ");

                // Show the songs in the user's list
                for(int i = 0; i < 10; i++){
                    if((i + 1) <= mediaList.size()){
                        System.out.println("[" + mediaList.get(i) + "]");
                    }
                    else{
                        System.out.println("[EMPTY]");
                    }
                }

                System.out.println("\nType any key to continue...");
                sc.nextLine();
                System.out.println("Would you like to add to your list? Yes/No");

                // Makes sure that second loop doesn't automatically open the list
                blnList = false;
                strChoice = sc.nextLine();

                if(strChoice.equalsIgnoreCase("yes") && mediaList.size() <= 10){
                    System.out.println("What song would you like to add? (Type the number of the film)");
                    System.out.println("Type '11' to stop adding films");
                    blnList = true;
                }

                // This occurs when the user's list is full
                else if(strChoice.equalsIgnoreCase("yes") && mediaList.size() > 10){
                    while(true){
                        System.out.println("Your list is full! Which slot would you like to replace: ");
                        intSlot = sc.nextInt();
                        sc.nextLine();

                        // Sets the user's selected slot on their list with a show the user wants
                        if(intSlot <= 10 && intSlot > 0){
                            System.out.println("What film would you like to replace with? (Type the number of the film)");
                            intMedia = sc.nextInt();
                            sc.nextLine();

                            // Sets films for both the object and string array
                            if(intMedia < 6){
                                mediaList.set(intSlot - 1, newSpotifyList.getSong(intMedia - 1).getName());
                                objMediaList.set(intSlot - 1, newSpotifyList.getSong(intMedia - 1));
                            }
                            else if(intMedia > 5 && intMedia < 11){
                                mediaList.set(intSlot - 1, newSpotifyList.getPodcasts(intMedia - 6).getName());
                                objMediaList.set(intSlot - 1, newSpotifyList.getPodcasts(intMedia - 6));
                            }      
                            break;
                        }
                        else{
                            System.out.println("Type a real option!");
                        }
                    }
                }

                // Loops until user decides to exit
                while(blnList){     
                    intMedia = sc.nextInt();
                    sc.nextLine();   

                    // Adds user selected films
                    if(intMedia < 6){
                        mediaList.add(newSpotifyList.getSong(intMedia - 1).getName());  
                        objMediaList.add(newSpotifyList.getSong(intMedia - 1));  
                    }
                    else if(intMedia > 5 && intMedia < 11){
                        mediaList.add(newSpotifyList.getPodcasts(intMedia - 6).getName());  
                        objMediaList.add(newSpotifyList.getPodcasts(intMedia - 6));  
                    }      
                    else if(intMedia == 11){
                        break;
                    }
                    else{
                        System.out.println("Type a real option!");
                    }
                }
                break;
                System.out.println("Type any key to continue: ");
                System.out.println();
                sc.nextLine();
                System.out.println();
                break;
                
            case "3":
                // Exits the program
                blnMenu = false;
        }
    }
    sc.close();
}
    
}
