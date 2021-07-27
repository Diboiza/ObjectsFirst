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
     * print information about this item
     */
    public void print(){
        System.out.println(title + "(+" +
                "" + playingTime +
                " mins)");
        if(ownIt){
            System.out.println("Own it: Yes");
        }
        else {
            System.out.println("Own it: No");
        }
        System.out.println("     " + comment);
    }
}
