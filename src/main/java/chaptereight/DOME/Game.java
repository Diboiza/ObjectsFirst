package chaptereight.DOME;

/**
 * A game class that models all types of games
 */
public class Game extends Item {

    private int noOfPlayers;

    /**
     * Initialize the fields of the super class and game
     * @param title of the game
     * @param playingTime average playing time of the game
     * @param noOfPlayers allowed in the game
     */
    public Game(String title, int playingTime, int noOfPlayers) {
        super(title, playingTime);
        this.noOfPlayers = noOfPlayers;
    }

    /**
     * @return the number of players in the game
     */
    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    /**
     *
     * @return overridden string of this class
     */
    public String toString(){
        return super.toString() + "\n        No of players: " + noOfPlayers + "\n";

    }

    /**
     * print information about this item
     */
    public void print() {
        System.out.println(this);
    }
}
