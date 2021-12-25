import java.util.Scanner;

public class main {
    public static void main(String[] args){
        boolean continuousRun = true;
        Scanner in = new Scanner(System.in);
        Inventory inventory = new Inventory();
        while (continuousRun) {

            System.out.println("############################################################################");
            System.out.println("HOME");
            System.out.println("");
            System.out.println("");
            options();
            String userInput = in.nextLine().toLowerCase();
            switch (userInput){
                case "item":
                    System.out.println("######### ITEMS #########");
                    itemOpt();
                    Item item;
                    boolean itemMod = true;
                    while (itemMod){
                        userInput = in.nextLine().toLowerCase();
                        switch (userInput){
                            case ".add":

                                System.out.println("Add Item");
                                System.out.println("");
                                System.out.println("Item name?");
                                String itemName = in.nextLine().toLowerCase();
                                System.out.println("");
                                System.out.println("Price?");
                                Double itemPrice = Double.parseDouble(in.nextLine());
                                System.out.println("");
                                System.out.println("Category? if none/misc leave blank");
                                String categoryName = in.nextLine().toLowerCase();
                                if (categoryName.equals("") || categoryName.equals("misc")){
                                    //to do grab ID from inventory and set idCounter to highestID + 1
                                    item = new Item(itemName, itemPrice, 0);
                                } else {
                                    item = new Item(itemName, itemPrice, 0, categoryName);
                                }
                                inventory.addItemToInventory(item);
                                break;
                            case "view":
                                if (inventory.itemListNotEmpty()){
                                    System.out.println(inventory);
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
    public static void options(){
        System.out.println("inventory");
        System.out.println("item");
        System.out.println("category");
    }
    public static void itemOpt(){
        System.out.println(".add");
        System.out.println(".remove");
        System.out.println(".removelast");
    }
}
