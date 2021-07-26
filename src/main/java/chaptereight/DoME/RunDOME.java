package chaptereight.DoME;

public class RunDOME {
    public static void main(String[] args) {
        Database database = new Database();
        CD freshFlava = new CD("Fresh Flava 5", "Various", 12, 2);

        database.addCds(freshFlava);
        database.list();

        freshFlava.setComment("A classic deep house compilation");
        database.list();
    }
}
