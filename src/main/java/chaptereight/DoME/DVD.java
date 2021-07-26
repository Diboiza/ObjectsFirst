package chaptereight.DoME;

/**
 * This class models the DVD object, it stores and retrieves info
 * about a DVD
 */
public class DVD {

    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Create a new object of the DVD
     * @param title
     * @param director
     * @param playingTime
     */
    public DVD(String title, String director, int playingTime) {
        this.title = title;
        this.director = director;
        this.playingTime = playingTime;
        this.gotIt = false;
        this.comment = "";
    }

    /**
     * Indidcator of whether we own this dvd ir not
     * @return true or false
     */
    public boolean isGotIt() {
        return gotIt;
    }

    /**
     * set a flag of whether we own this DVD or not
     * @param gotIt
     */
    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    /**
     * @return comment made about the DVD
     */
    public String getComment() {
        return comment;
    }

    /**
     * a comment about the dvd
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * print info about the DVD7hy -
     */
    public void print(){
        System.out.println("DVD: " + title + "( " + playingTime +
                " mins)");
        if(gotIt){
            System.out.println("Own it: Yes");
        }
        else {
            System.out.println("Own it: No");
        }
        System.out.println("     " + director);
        System.out.println("     " + comment);
    }
}
