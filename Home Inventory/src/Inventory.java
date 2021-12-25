import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }
    public void addItemToInventory(Item item){
        this.items.add(item);
    }
    public boolean itemListNotEmpty(){
        if (items.size() > 0){
            return true;
        }
        return false;
    }
    public int getHighestId(){
        int highestInt = 0;
        if (items.size() == 0){
            return highestInt;
        }
        
        for (Item item : items){
            if (item.getId() > highestInt){
                highestInt = item.getId();

            }
        }

        return highestInt;
    }

    public String toString(){
        String out = "";
        for (Item item : items){
            out += item;
        }
        return out + "\n";
    }


}
