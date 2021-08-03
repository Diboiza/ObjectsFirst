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

    /**
     *
     * @return the artist name
     */
    public String getArtist() {
        return artist;
    }

    /**
     *
     * @return the nu,ber of tracks in the CD
     */
    public int getNoOfTracks() {
        return noOfTracks;
    }

    /**
     * print shortDetails about the zCD
     */
    public void printShortDetails(){
        System.out.println("Artist: " + artist + "\n Title: " + getTitle());
    }

    /**
     *
     * @return overridden string of this class
     */
    public String toString(){
        return "CD: " + artist + super.toString()   +
                "\n        tracks: " + noOfTracks + "\n";
    }


    /**
     * print information about this item
     */
    @Override
    protected void print() {
        super.print();
    }
}
