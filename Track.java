/**
 * @author Hayden Bunce
 * class provides a set of method functionality for the abstract song
 */
public class Track extends Song{
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;
    private int lengthOfSong;
    private String path;
    /**
    * Constructor
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre, int lengthOfSong, String path){
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
        this.lengthOfSong = lengthOfSong;
        this.path = path;
    }
    @Override
    /**
     * @return Title
     */
    public String getTitle() {
        return this.title;
    }

    @Override
    /**
     * @return Album
     */
    public String getAlbum() {
        return this.album;
    }

    @Override
    /**
     * @return first name
     */
    public String getArtistFirstName() {
        return this.firstName;
    }

    @Override
    /**
     * @return last name
     */
    public String getArtistLastName() {
        return this.lastName;
    }

    @Override
    /**
     * @return genre
     * Additionally structures the Genre to be in proper casing before returning
     */
    public String getGenre() {
        String returnAString = String.valueOf(this.genre).toLowerCase();
        String returnString = String.valueOf(this.genre).charAt(0) + "";
        for (int i =1; i<returnAString.length(); i++){
            returnString += returnAString.charAt(i);
        }
        
        return returnString;
    }
    @Override
    /**
     * @return length 
     */
    public int getLength() { 
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
