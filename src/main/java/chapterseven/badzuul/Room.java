package chapterseven.badzuul;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
    private ArrayList<Item> items;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<>();
        items = new ArrayList<>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param direction The direction.
     * @param neighbor The room in the given direction.
     */
    public void setExits(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    public Room getExit(String direction){
        return exits.get(direction);
    }

    public String getExitString(){
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for (String key: keys) {
            returnString += " " + key;
        }
        return returnString;
    }

    /**
     * add a items to the room.
     * @param item to be added to the room
     */

    public void addItem(Item item){
        items.add(item);
    }

    /**
     * Display all the items that are in the room
     * @return a list of all items in the room
     */

    private String getAllItems(){
        StringBuilder bld = new StringBuilder();
        for (Item item: items) {
            bld.append("\n ").append(item.getItemDetails());
        }
        return bld.toString();
    }

    /**
     * Get a list if all items in the current room
     * @return A list of all items in a room
     */
    public ArrayList<Item> getItems() {
        return items;
    }


    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Return a long description of this room, of the form:
     * You are in the kitchen.
     * Exits: north west
     * @return A description of the room including the exits
     */
    public String getLongDescription(){
        return "You are " + description + ".\n" + getExitString() + ".\nItems:" + getAllItems();
    }

}
