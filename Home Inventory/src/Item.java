public class Item {
    private final String name;
    private final double price;
    private final Category category;
    private final int id;
    private int idCounter;

    public Item(String name, Double price, int id) {
        this.name = name;
        this.price = price;
        this.category = new Category();
        this.id = idCounter;
        idCounter++;
    }

    public Item(String name, Double price, int id, String category) {
        this.name = name;
        this.price = price;
        this.category = new Category(category);
        this.id = idCounter;
        idCounter++;

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

    public String toString() {
        return this.id + ": " + this.name + ": " + this.price + ", " + this.category.getCategoryName();
    }
}
