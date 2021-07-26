package chapterseven.badzuul;

import java.util.ArrayList;

/**
 * This class describes the player that will be in the game,
 * the functionalities they can perform
 */
public class Player {

    private String name;
    private int maxWeight;
    private Room currentRoom;
    private ArrayList<Item> pickedItems;

    //create a new player object
    public Player(String name)
    {
        this.name = name;
        maxWeight = 50;
        pickedItems = new ArrayList<>();
    }

    /**
     * Get the current room the player is in
     * @return the room the is in
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Set the current room of the player
     * @param currentRoom of the player
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * pick up an item and add to the list of items a player is carrying
     * @param item picked up
     */
    public void take(Item item){
        if(currentRoom.getItems().contains(item))
        {
            int index = currentRoom.getItems().indexOf(item);
            pickedItems.add(currentRoom.getItems().get(index));
            currentRoom.getItems().remove(index);
        }
        else {
            System.out.println("The specified item is not in the room");
        }
    }

    public void drop(Item item){
       if(pickedItems.contains(item)){
         pickedItems.remove(item);
       }
       else {
           System.out.println("You did not pick up that item");
       }
    }
}
