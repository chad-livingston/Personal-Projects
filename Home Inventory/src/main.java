
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean continuousRun = true;
        Scanner in = new Scanner(System.in);
        Inventory inventory = new Inventory();
        while (continuousRun) {

            System.out.println("############################################################################");
            System.out.println("HOME");
            System.out.println();
            System.out.println();
            options();
            String userInput = in.nextLine().toLowerCase();
            switch (userInput) {
                case "item":
                    System.out.println("######### ITEMS #########");
                    itemOpt();
                    Item item = new Item();
                    boolean itemMod = true;
                    while (itemMod) {
                        userInput = in.nextLine().toLowerCase();
                        switch (userInput) {
                            case ".add":
                                boolean adding = true;
                                while (adding) {

                                    System.out.println("Add Item to the list");
                                    System.out.println("Item name? leave blank to exit");
                                    String itemName = in.nextLine().toLowerCase();
                                    if (itemName.equals("")){
                                        adding = false;
                                        break;
                                    }
                                    System.out.println("Price?");
                                    Double itemPrice = Double.parseDouble(in.nextLine());
                                    System.out.println("Category? if none/misc leave blank");
                                    String categoryName = in.nextLine().toLowerCase();
                                    int id = inventory.getHighestId();
                                    if (categoryName.equals("") || categoryName.equals("misc")) {

                                        item = new Item(itemName, itemPrice, id);
                                    } else {
                                        item = new Item(itemName, itemPrice, categoryName, id);
                                    }
                                    inventory.addItemToInventory(item);
                                    System.out.println("Added Item ##### " + item);

                                   // System.out.println("SUM ALL: " + item.sumAll(inventory.getItemsFromInventory()));

                                }
                                break;
                            case "view":
                                if (inventory.itemListNotEmpty()) {
                                    System.out.println(inventory);
                                    System.out.println("Enter a category to sum:");
                                    String categoryInput = in.nextLine().toLowerCase();
                                    if (categoryInput.equals("")){
                                        categoryInput = "misc";
                                    }

                                    System.out.println("Sum of All items: " + item.sumAll(inventory.getItemsFromInventory()));
                                    System.out.println("Sum all "+ categoryInput.toLowerCase() +" Items: " + item.sumCategory(inventory.getItemsFromInventory(), categoryInput));
                                }


                                break;
                            default:
                                break;

                        }
                    }

                    break;
                case "opt":
                    System.out.println();
                    break;
                case "exit":
                    System.out.println("Closing the program");
                    continuousRun = false;
                    in.close();
                    break;
                default:
                    System.out.println("Invalid Command received.");
                    options();
                    break;
            }
        }
    }

    public static void options() {
        System.out.println("inventory");
        System.out.println("item");
        System.out.println("category");
    }

    public static void itemOpt() {
        System.out.println(".add");
        System.out.println(".remove");
        System.out.println(".removelast");
    }
}
