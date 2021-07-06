package chapterseven.betterzuul;

public class Item {

    private String name;
    private String itemDescription;
    private int itemWeight;

    /**
     * Create/add a new item that will be added to a room
     * @param itemDescription the name of the item
     * @param itemWeight the weight of the item to determine if it can be picked up or not
     */
    public Item(String name,String itemDescription, int itemWeight){
        this.name = name;
        this.itemDescription = itemDescription;
        this.itemWeight = itemWeight;
    }

    /**
     * get the name of the item
     * @return the item name
     */
    public String getName() {
        return name;
    }

    /**
     * get the description of the room
     * @return the item in question
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * return the weight of the item in question
     * @return the weight
     */
    public int getItemWeight() {
        return itemWeight;
    }

    /**
     * Return both the description and weight of the item
     * @return a Description of the item including weights.
     */
    public String getItemDetails(){
        return "Name: " + getName() +"\n"+ "Item: " + getItemDescription() +"\n"+ "Weight: " + getItemWeight();
    }
}
