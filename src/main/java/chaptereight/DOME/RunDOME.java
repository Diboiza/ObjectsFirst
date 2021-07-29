package chaptereight.DOME;

public class RunDOME {
    public static void main(String[] args) {
        Database database = new Database();
        CD freshFlava = new CD("Fresh Flava 5", 12, "Various", 2);
        freshFlava.setComment("Fresh Flava");
        DVD desperado = new DVD("Desperado", 2, "Quitin Torentino");
        desperado.setComment("classic");
        VideoGame Fifa = new VideoGame("FiFA 2021", 5000, 22, "Sony Playstation");
        Fifa.setComment("The best");
        database.addItems(freshFlava);
        database.addItems(desperado);
        database.addItems(Fifa);
        database.list();

    }
}
