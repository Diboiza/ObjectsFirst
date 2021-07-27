package chaptereight.DOME;

/**
 * Video game class that models a video game
 */
public class VideoGame extends Game{

    private String platform;

    /**
     * Initialize the fields of the fields of the superclasses and of the video game
     * @param title of the game
     * @param playingTime of the game
     * @param noOfPlayers allowed
     * @param platform
     */
    public VideoGame(String title, int playingTime, int noOfPlayers, String platform) {
        super(title, playingTime, noOfPlayers);
        this.platform = platform;
    }

    public String getPlatoform() {
        return platform;
    }
}
