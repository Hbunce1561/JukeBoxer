import java.util.*;

/**
 * Driver Prgoram to interact with the JukeBox
 */
public class MusicProgram {
    public MusicProgram() {

    }

    /**
     * Createa a Jukebox, adds and plays songs
     */
    public void run() {
        JukeBox jukebox = new JukeBox();
        jukebox.addSong(new Track("Waiting On A War", "Medicine at Midnight", "Foo Fighters", "", Genre.ROCK, 256000,"./WaitingonaWar.mp3"));
        jukebox.addSong(new Track("What's Your Country Song", "Country Again", "Thomas", "Rhett", Genre.COUNTRY, 175000, "./Whatsyourcountrysong.mp3"));
        jukebox.addSong(new Track("Turn Off the Lights, I'm Watching Back to the Future Pt. II", "Acceptance Speech", "Dance Gavin Dance", "", Genre.ROCK, 360000, "./song.mp3"));
        jukebox.addSong(new Track("Stick Stickly", "Someday Came Suddenly", "Attack Attack!", "", Genre.CRABCORE, 360000, "./StickStickly.mp3"));
        // add oldies to jukebox
        ArrayList<Tune> tunes = getMyOldies();
        for (Tune tune : tunes) {
            jukebox.addSong(new SongAdapter(tune));
        }
        while(true){
           jukebox.play(printSongs(jukebox));
        }
        
    }

    /**
     * Gather a list of oldie songs
     * 
     * @return And ArrayList of Tunes
     */
    private ArrayList<Tune> getMyOldies() {
        ArrayList<Tune> tunes = new ArrayList<>();
        tunes.add(new Oldie("Tom Petty", "Free Fallin", "Full Moon Fever", "Classic Rock", 262000, "./FreeFallin.mp3"));
        tunes.add(new Oldie("Alesana", "Curse of the Virgin Canvas", "The Emptiness", "Metalcore", 254000, "./Curse.mp3"));
        tunes.add(new Oldie("The Beatles", "Twist and Shout", "Please Please Me", "Rock", 159000, "./TandS.mp3"));
        tunes.add(new Oldie("Chunk! No, Captain Chunk!", "MILF", "Something for Nothing", "Easycore", 239000, "./Milf.mp3"));
        return tunes;
    }
    public String printSongs(JukeBox jBox){
        ArrayList<Song> songs = jBox.getAllSongs();
        Scanner scan = new Scanner(System.in);
        while(true){
            int selection = -1;
            System.out.println("~~~~~~ Select A Song ~~~~~~");
            for(int i =0; i < songs.size(); i++){
                System.out.println(i+1 +": "+songs.get(i).getTitle());
            }
            System.out.println("\n[Q] to quit\n");
            String temp = scan.nextLine();
            try{
                selection = Integer.parseInt(temp);
                if(selection > 0 && selection <= songs.size()+1){
                    return songs.get(selection-1).getTitle();
                }
                else{
                    System.out.println("Invalid input");
                }
            }
            catch(NumberFormatException nfe){
                selection = -1;
                switch(temp){
                    case "q", "Q":
                        scan.close();
                        System.exit(1);
                    default:
                        System.out.println("Invalid input");
                }

            }
        }
    }
        

    public static void main(String[] args) {
        MusicProgram program = new MusicProgram();
        program.run();
    }
}
