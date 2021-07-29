package chaptereight.DOME;

/**
 * This class models the DVD object, it stores and retrieves info
 * about a DVD
 */
public class DVD extends Item{

    private String director;

    public DVD(String title, int playingTime, String director){
        super(title, playingTime);
        this.director = director;
    }

    /**
     *
     * @return the director details
     */
    public String getDirector() {
        return director;
    }

    /**
     *
     * @return overridden string of this class
     */
    public String toString(){
       return super.toString() + "\n        Director: " + director + "\n";
    }

    /**
     * print information about this item
     */
    public void print(){
        System.out.println(this);
    }
}
