/**
 * @author Hayden Bunce
 * Class uses the methods defined in tune interface
 */
public class Oldie implements Tune{
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;
    private int lengthOfSong;
    private String path;
    /**
     * Constructor
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category, int lengthOfSong, String path){
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
        this.lengthOfSong = lengthOfSong;
        this.path = path;
    }
    @Override
    /**
     * @return artist name
     */
    public String getArtistName() {
        return this.artistName;
    }

    @Override
    /**
     * @return song and record title, seperated by a colon
     */
    public String getDisplayTitle() {
        return this.songTitle +" : "+ this.recordTitle;
    }

    @Override
    /**
     * @return genre of song
     */
    public String getCategory() {
        return this.category;
    }
    @Override
    /**
     * @return length
     */
    public int getLength(){
        return this.lengthOfSong;
    }
    @Override
    /**
     * @return path
     */
    public String getPath(){
        return this.path;
    }
    
}
