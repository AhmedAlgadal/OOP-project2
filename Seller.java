import java.util.ArrayList;
import java.util.Scanner;

public class Seller extends User {

    private ItemCollections itemColl;
    private double money;
    private Scanner scanner;
    private String selection;
    private double rate;

    public Seller() {
        scanner = new Scanner(System.in);
        itemColl = new ItemCollections();
    }

    public Seller(int uId, String uName, String uEmail, String uPassword, boolean isActive, double money) {
        super(uId, uName, uEmail, uPassword, isActive, money);
        scanner = new Scanner(System.in);
        itemColl = new ItemCollections();
    }

    public void showSellerBoard() {
        do {
            System.out.println("Seller Interface");
            System.out.println("=================");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Display Selling Statistics");
            System.out.println("5. Exit");

            System.out.print("Enter your selection: ");
            selection= scanner.nextLine();
            switch (selection.trim()) {
                case "1":
                //--------------
                System.out.println();
                addProducts();
                    break;
                case "2":
                // ------------------
                // display all produst
                System.out.println();
                removeItem();
                    break;
                case "3":
                // ------------------
                System.out.println();
                ItemCollections.displayAllItems();
                    break;
                case "4":
                // ------------------
                System.out.println("case 4");
                    break;
                case "5":
                    System.out.println("Exiting Seller Interface...");
                    System.out.println("Exit successful. Good Bye.");
                    return;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("press Enter...");
            scanner.nextLine();
        } while (!selection.equals("5"));
    }

    public void addProducts() {
        Item item = new Item();
        System.out.println("Enter Item name:");
        item.setItemName(scanner.nextLine());
        System.out.println("Enter Item price:");
        double s;
        String g = scanner.nextLine().trim();
        // try and catch block to handle the String input .
        try {
            s = Double.parseDouble(g);
        } catch (Exception e) {
            System.out.println("You have to enter a number.");
            return;
        }
        item.setPrice(s);
        System.out.println("Enter Item quantity:");
        int s2;
        String g2 = scanner.nextLine().trim();
        // try and catch block to handle the String input .
        try {
            s2 = Integer.parseInt(g2);
        } catch (Exception e) {
            System.out.println("You have to enter an integer number.");
            return;
        }
        item.setQuantity(s2);
        item.setItemNo(Item.getItemCount());
        itemColl.storeItem(item);
        // will set this Seller as the seller of the item.
        item.setSeller(this);
        System.out.println("add done.");
        scanner.nextLine();

    }
//    public void addNewItem(Item item) {
//        products.add(item);
//        System.out.println("New item added successfully.");
//    }

   public void removeItem() {
    ItemCollections.displayAllItems();
    System.out.println("Choose the Item number to remove it:");
    int s;
    String g = scanner.nextLine().trim();
    // try and catch block to handle the String input .
    try {
        s = Integer.parseInt(g);
    } catch (Exception e) {
        System.out.println("You have to enter an integer number.");
        return;
    }

    if (ItemCollections.getItems().size() >= s && s > 0) {
        System.out.println(ItemCollections.getItems(s - 1).getItemName() + " is removed now.");
        ItemCollections.removeItem(s - 1);
    } else {
        System.out.println("this product does not exist");
    }
}
//public void updateProducts(Item item, int quantityChange) {
//    boolean itemFound = false;
//    int indexToUpdate = -1;
//
//    for (int i = 0; i < products.size(); i++) {
//        if (products.get(i).getItemNo().equals(item.getItemNo())) {
//            itemFound = true;
//            indexToUpdate = i;
//            break;
//        }
//    }
//
//    if (itemFound) {
//        int newQuantity = products.get(indexToUpdate).getQuantity() + quantityChange;
//
//        if (newQuantity >= 0) {
//            products.get(indexToUpdate).setQuantity(newQuantity);
//            System.out.println("Item quantity updated successfully.");
//        } else {
//            System.out.println("Insufficient stock to update item quantity.");
//        }
//    } else {
//        System.out.println("Item not found.");
//    }
//}
//public double calculateTotalEarnings() {
//    double totalEarnings = 0.00;
//
//    for (Item item : products) {
//        totalEarnings += item.getPrice() * item.getBoughtTimes();
//    }
//
//    return totalEarnings;
//}

    public void displayProducts() {
        int index = 1;
        for (Item item : ItemCollections.getItems()) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock ");
            }
            else{
            System.out.println("#" + index + " "+item.getItemName());
            }
            index++;
        }
    }

        public void getStatistics() {
        int index = 1;
        for (Item item : ItemCollections.getItems()) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock" + " bought "+ item.BoughtTimes()+ " times");
            }
            else{
                
            System.out.println("#" + index + " "+item.getItemName()+ item.BoughtTimes()+ " times");
            }
            index++;
        }
    }


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        // avg of the rates
        this.rate = rate;
    }



}
