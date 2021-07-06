package chapterseven.betterzuul;

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
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
    private Item item;

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
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param direction The north exit.
     * @param neighbor The east east.
     */
    public void setExits(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * Return the room that is reach if we go from this room
     * in direction "direction. if there is no room'in that
     * direction return null
     * @param direction the direction we want to exit
     * @return the room that is reached
     */
    public Room getExit(String direction){
        return exits.get(direction);
    }

    /**
     * Return a description of the room's exits,
     * e.g "exits: north west.
     * @return a description of the availble exits
     */
    public String getExitString(){
        String returnString = "Exits: ";
        Set<String> keys = exits.keySet();
        for (String exit: keys) {
            returnString += " " + exit;
        }
        return returnString;
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
     * you are in the kitchen.
     * Exits: north west
     * @return a Description of the room including exits.
     */
    public String getLongDescription(){
        return "You are " + description + ".\n" + getExitString();
    }

    public void addItem(Item item){

    }

}
