import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();
    private int highestID;

    public Inventory(){
        this.highestID = getHighestId();
        //this.items = new ArrayList<>();
    }
    public void addItemToInventory(Item item){
        this.items.add(item);
    }
    public ArrayList<Item> getItemsFromInventory(){
        return this.items;
    }
    public boolean itemListNotEmpty(){
        if (items.size() > 0){
            return true;
        }
        return false;
    }
    public int getHighestId(){
        if (items.size() == 0){
            return highestID = 0;
        }

        for (Item item : items){
            if (item.getId() > highestID){
                this.highestID = item.getId();

            }
        }
        //System.out.println(highestID);
        return  highestID;
    }

    public String toString(){
        String out = "";
        for (Item item : items){
            out += item + "\n";
        }
        return out;
    }


}
