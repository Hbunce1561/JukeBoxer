/**
 * @author Hayden Bunce
 * abstract for making a song, overridden by track and song Adapter
 */
public abstract class Song {
    public String getTitle(){
        return null;
    }
    public String getAlbum(){
        return null;
    }
    public String getArtistFirstName(){
        return null;
    }
    public String getArtistLastName(){
        return null;

    }
    public String getGenre(){
        return null;
    }
    public String toString(){
        String string = "\nNow Playing: " + this.getTitle()
        +"\nAlbum: " +this.getAlbum()
        +"\nArtist: " + this.getArtistFirstName() + " " + this.getArtistLastName() 
        + "\nGenre: " + this.getGenre()+"\n";
        return string;
    }
    public int getLength(){
        return 0;
    }
    public String getPath(){
        return null;
    }
}
