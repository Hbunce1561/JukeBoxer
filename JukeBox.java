/**
 * @author Hayden Bunce
 * Class serves to implement the song hashmap and play functions
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.*;
import java.io.*;
public class JukeBox{
    private HashMap songs;
    private ArrayList<String> keys;
    /**
     * Constructor
     */
    public JukeBox(){
        this.songs = new HashMap<String, Song>();
        this.keys = new ArrayList<>();

    }
    /**
     * adds song to the HashMap
     * @param song
     */
    public void addSong(Song song){
        this.songs.put(song.getTitle(), song);
        this.keys.add(song.getTitle());

    }
    /**
     * Searches for a song in the hash map, if found, it pulls the information on it, then uses the path to play the song, and the length to pause the program until the  song is done
     * @param songName
     */
    public void play(String songName){
        if(this.songs.containsKey(songName)){
            Song temp = (Song) songs.get(songName);
            String Path = temp.getPath();
	        File file = new File(Path);
            System.out.println(temp.toString());
            try {
                Desktop.getDesktop().open(file);
                
                }catch(Exception e) {
                    System.exit(0);	
                }
            
        }
    }
    public ArrayList<Song> getAllSongs(){
        ArrayList<Song> songsList = new ArrayList<>();
        for(int i = 0; i < keys.size(); i++){
            songsList.add((Song) songs.get(keys.get(i)));
        }
        return songsList;

    }
}
