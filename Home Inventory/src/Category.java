import java.util.ArrayList;

public class Category {
    private String categoryName;
    private ArrayList<String> categories;

    public Category(){
        this.categoryName = "misc";
    }

    public Category(String categoryName){
        this.categoryName = categoryName;
    }

    public String getCategoryName(){
        return this.categoryName;
    }

    public void addCategory(String categoryToAdd){
        if (!categories.contains(categoryToAdd)){
            categories.add(categoryToAdd);
        } else {
            System.out.println("Category already exists");
        }

    }
    public String printCategories(ArrayList<String> categories){
        String categoriesList = "";
        for (String category : categories){
            categoriesList += category;
        }
        return categoriesList;
    }

    public String toString(){
        return this.categoryName;
    }
}
