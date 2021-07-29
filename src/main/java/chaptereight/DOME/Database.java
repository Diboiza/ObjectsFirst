package chaptereight.DOME;

import java.util.ArrayList;

/**
 * The database class provides a facility to store Media items
 * It does not have the search functionality
 */
public class Database {

    private ArrayList<Item> items;

    /**
     * Initialize an empty database
     */
    public Database(){
        items = new ArrayList<>();
    }

    /**
     * Add an item to the database
     * @param item to be added to the database
     */
    public void addItems(Item item) {
        items.add(item);
    }


    public void list(){
        for (Item item: items) {
            System.out.println(item);
        }
    }
}
