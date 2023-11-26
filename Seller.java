import java.util.ArrayList;
import java.util.Scanner;

public class Seller extends User {

    private ArrayList<Item> products;
    private ItemCollections itemColl;
    private double money;
    private Scanner scanner;
    private String selection;

    public Seller() {
        products = new ArrayList<Item>();
        scanner = new Scanner(System.in);
        itemColl = new ItemCollections();
    }

    public Seller(int uId, String uName, String uEmail, String uPassword, boolean isActive) {
        super(uId, uName, uEmail, uPassword, isActive);
        products = new ArrayList<Item>();
        money=0;
        scanner = new Scanner(System.in);
        itemColl = new ItemCollections();
    }

    public void sellerBoard() {
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
                System.out.println("case 1");
                addProducts();
                    break;
                case "2":
                // ------------------
                // display all produst
                displayProducts();
                System.out.println("Enter the product Number:");
                int itemNo = scanner.nextInt();
                scanner.nextLine();
                removeItem(itemNo);
                    break;
                case "3":
                // ------------------
                System.out.println("case 3");
                displayProducts();
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
        System.out.println("Enter Item name");
        item.setItemName(scanner.nextLine());
        System.out.println("Enter Item price");
        item.setPrice(scanner.nextDouble());
        System.out.println("Enter Item quantity");
        item.setQuantity(scanner.nextInt());
        item.setItemNo(Item.getItemCount());
        products.add(item);
        itemColl.storeItem(item);
        System.out.println("add done");
        scanner.nextLine();

    }
//    public void addNewItem(Item item) {
//        products.add(item);
//        System.out.println("New item added successfully.");
//    }

   public void removeItem(int itemNo) {
       boolean itemFound = false;
       int indexToRemove = -1;

       for (int i = 0; i < products.size(); i++) {
           if (products.get(i).getItemNo()== itemNo) {
               itemFound = true;
               indexToRemove = i;
               break;
           }
       }

       if (itemFound) {
           products.remove(indexToRemove);
           System.out.println("Item removed successfully.");
       } else {
           System.out.println("Item not found.");
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
    public void removeProducts(Item item) {
        products.remove(item);
    }

    public void displayProducts() {
        int index = 1;
        for (Item item : products) {
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
        for (Item item : products) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock" + " bought "+ item.BoughtTimes()+ " times");
            }
            else{
                
            System.out.println("#" + index + " "+item.getItemName()+ item.BoughtTimes()+ " times");
            }
            index++;
        }
    }

    public ArrayList<Item> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Item> products) {
        this.products = products;
    }

}
