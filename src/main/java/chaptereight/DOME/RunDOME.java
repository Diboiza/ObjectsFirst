package chaptereight.DOME;

public class RunDOME {
    public static void main(String[] args) {
        Database database = new Database();
        CD freshFlava = new CD("Fresh Flava 5", 12, "Various", 2);
        VideoGame Fifa = new VideoGame("FiFA 2021", 5000, 22, "Sony Playstation");
        database.addItems(freshFlava);
        database.addItems(Fifa);
        database.list();

    }
}
