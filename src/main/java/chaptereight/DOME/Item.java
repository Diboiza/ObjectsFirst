package chaptereight.DOME;

/**
 * This class will be the parent class that holds all thr
 * common fields and methods for items
 */
public class Item {
    private String title;
    private int playingTime;
    private boolean ownIt;
    private String comment;

    /**
     * Initialize the fields of an Item
     * @param title of this item
     * @param playingTime time of this object
     */
    public Item(String title, int playingTime){
        this.title = title;
        this.playingTime = playingTime;
        this.ownIt = false;
        this.comment = "";
    }

    /**
     * indicator of whether a user owns this item or not
     * @return true or false
     */
    public boolean isOwnIt() {
        return ownIt;
    }

    /**
     * set indicator of whether the item is owned
     * @param ownIt
     */
    public void setOwnIt(boolean ownIt) {
        this.ownIt = ownIt;
    }

    /**
     * retyurn a comment about this items
     * @return a string
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @return the playing time of the item
     */
    public int getPlayingTime() {
        return playingTime;
    }

    /**
     * make a comment about this item
     * @param comment made
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return the title of this item
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return the overridden toString method of this class
     */
    public String toString(){
        String line1 = " " + title +  " (" + playingTime + " mins)";
        if(ownIt){
            return  line1 + "\n Own it: Yes " + "\n Comment: " + comment + "\n";
        }
        else {
            return  line1 + "\n Own it: No "  + "\n Comment: " + comment + "\n";
        }
    }

    /**
     * The toString method of this class
     */
    protected void print(){
        System.out.println(this);
    }


}
