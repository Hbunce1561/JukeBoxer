/**
 * @author Hayden Bunce
 * Class uses the tune variant of creating a track to play and adapts it to work with the methods called in the jukebox
 */
public class SongAdapter extends Song{
    private Tune tune;
    /**
     * Constructor
     */
    public SongAdapter(Tune tune){
        this.tune = tune;
    }
    @Override
    /**
     * method splits the song title from display
     * @return Title
     */
    public String getTitle() {
        String[] songTitle = this.tune.getDisplayTitle().split(" : ");
        return songTitle[0];
    }
    @Override
    /**
     * method splits album title away from display
     * @return album
     */
    public String getAlbum() {
        String[] albumTitle = this.tune.getDisplayTitle().split(" : ");
        return albumTitle[1];
    }

    @Override
    /**
     * method splits the artist name
     * @return first name
     */
    public String getArtistFirstName() {
        String[] firstName = this.tune.getArtistName().split(" ");
        return firstName[0];
    }

    @Override
    /**
     * method splits the artist name
     * @return last name
     */
    public String getArtistLastName() {
        try{
        String[] lastName = this.tune.getArtistName().split(" ");
        if(lastName.length > 2){
            String last = "";
            for (int i = 1; i <lastName.length; i++){
                last += lastName[i];
                last += " ";
            }
            return last;
        }
        return lastName[1];
        }catch(IndexOutOfBoundsException iob){
            return "";
        }
    }

    @Override
    /**
     * @return category
     */
    public String getGenre() {
        return this.tune.getCategory();
    }
    @Override
    /**
     * @return length
     */
    public int getLength(){
        return this.tune.getLength();
    }
    @Override
    /**
     * @return path
     */
    public String getPath(){
        return this.tune.getPath();
    }

}