package chaptereight.DOME;

/**
 * This class represents a music CD object.
 * information about a CD is stored and retrieved
 */
public class CD extends Item {
    private String artist;
    private int noOfTracks;


    public CD(String artist, int noOfTracks, String title, int playingTime) {
        super(title, playingTime);
        this.artist = artist;
        this.noOfTracks = noOfTracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getNoOfTracks() {
        return noOfTracks;
    }

    public void printShortDetails(){
        System.out.println("Artist: " + artist + "\n Title: " + getTitle());
    }
}
