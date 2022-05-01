/**
 * @author Hayden Bunce
 * interface for making a tune, overridden by oldie
 */
public interface Tune{
    public String getArtistName();
    public String getDisplayTitle();
    public String getCategory();
    public int getLength();
    public String getPath();
}
