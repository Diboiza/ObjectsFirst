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

    public String getDirector() {
        return director;
    }
}
