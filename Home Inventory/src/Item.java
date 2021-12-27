import java.util.ArrayList;

public class Item {
    private String name;
    private double price;
    private Category category;
    private int id;
    //private int idCounter;

    public Item(String name, Double price,int id ) {
        this.name = name;
        this.price = price;
        this.category = new Category();
        this.id = id + 1;
    }

    public Item(String name, Double price, String category, int id) {
        this.name = name;
        this.price = price;
        this.category = new Category(category);
        this.id = id + 1;

    }
    public Item(){
        this.name = "";
        this.price = 0.00;
        this.category = new Category();
        this.id = id + 1;
    }
    public double sumCategory(ArrayList<Item> items, String category){
        double sum = 0.00;
        for (Item item : items){
            if (item.getCategory().getCategoryName().equals(category)){
                sum += item.getPrice();
            }
        }
        return sum;
    }
    public double sumAll(ArrayList<Item>  items){
        double sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String toString() {
        return this.id + ": " + this.name + " : " + "$" + this.price + ", " + this.category.getCategoryName();
    }
}
