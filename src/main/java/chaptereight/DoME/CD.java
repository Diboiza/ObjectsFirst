package chaptereight.DoME;

/**
 * This class represents a music CD object.
 * information about a CD is stored and retrieved
 */
public class CD {
    private String title;
    private String artist;
    private int noOfTracks;
    private int duration;
    private boolean ownIt;
    private String comment;

    /**
     * Initialize the CD
     * @param title of the CD
     * @param artist of the CD
     * @param noOfTracks of the CD
     * @param duration of the CD
     */
    public CD(String title, String artist, int noOfTracks, int duration) {
        this.title = title;
        this.artist = artist;
        this.noOfTracks = noOfTracks;
        this.duration = duration;
        this.ownIt = false;
        this.comment = "";
    }

    /**
     * @return true if we own this CD
     */
    public boolean isOwnIt() {
        return ownIt;
    }

    /**
     * Set the flag of whether we own this cd or not
     * @param ownIt
     */
    public void setOwnIt(boolean ownIt) {
        this.ownIt = ownIt;
    }

    /**
     *
     * @return the comment that we made about this CD
     */
    public String getComment() {
        return comment;
    }

    /**
     * Set a comment about this cd
     * @param comment String of words
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * print details about the cd
     */
    public void print(){
        System.out.println("CD: " + title + " (" + duration +
                 " mins)");
        if(ownIt){
            System.out.println("own it: Yes");
        }
        else {
            System.out.println("own it: No");
        }
        System.out.println("      " + artist);
        System.out.println("      tracks:" + noOfTracks);
        System.out.println("      " + comment);
    }
}
