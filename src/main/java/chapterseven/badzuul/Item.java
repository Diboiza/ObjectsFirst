package chapterseven.badzuul;

public class Item {

    private String name;
    private String description;
    private String weight;

    /**
     * Create a new Item Specify its weight and description
     * @param description of the item.
     * @param weight of the item.
     */
    public Item(String description, String weight){
        this.description = description;
        this.weight = weight;
    }


    public String getItemDetails(){
        return"Name: " + name + "\nDescription: "+ description + "\nWeight: " + weight;
    }
}
