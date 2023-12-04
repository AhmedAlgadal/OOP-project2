import java.util.*;

public class Seller extends User {

    private Scanner scanner;
    private String selection;
    private double rate;
    private int ratingCount;
    private ArrayList<Item> products;

    public Seller() {
        scanner = new Scanner(System.in);
        products = new ArrayList<>();
    }

    public Seller(int uId, String uName, String uEmail, String uPassword, boolean isActive, double balance) {
        super(uId, uName, uEmail, uPassword, isActive, balance);
        scanner = new Scanner(System.in);
        products = new ArrayList<>();
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
            selection = scanner.nextLine();
            switch (selection.trim()) {
                case "1":
                    // --------------
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
                    this.displayAllItems();
                    break;
                case "4":
                    // ------------------
                    System.out.println();
                    displayStatistics();
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
        // will set this Seller as the seller of the item.
        item.setSeller(this);
        this.addProducts(item);
        ItemCollections.storeItem(item);
        System.out.println("add done.");

    }

    public void removeItem() {
        this.displayAllItems();
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

        if (getProducts().size() >= s && s > 0) {
            System.out.println(getProducts(s - 1).getItemName() + " is removed now.");
            ItemCollections.getItems().remove(getProducts(s-1));
            removeProducts(s-1);
        } else {
            System.out.println("this product does not exist");
        }
    }

    public void getStatistics() {
        int index = 1;
        for (Item item : ItemCollections.getItems()) {
            if (item.getQuantity() == 0) {
                System.out.println("#" + index + " " + item.getItemName() + " out of stock" + " bought "
                        + item.BoughtTimes() + " times");
            } else {

                System.out.println("#" + index + " " + item.getItemName() + item.BoughtTimes() + " times");
            }
            index++;
        }
    }

    public double getRate() {

        return rate;
    }

    public void setRate(double rate) {
        // avg of the rates
        ratingCount++;
        double r = (getRate() + rate) / ratingCount;
        this.rate = r;
    }

    public ArrayList<Item> getProducts() {
        return products;
    }

    public void addProducts(Item item) {
        this.products.add(item);
    }

    public  Item getProducts(int n) {
        return products.get(n);
    }


    public  void removeProducts(int itemNo) {
        products.remove(getProducts(itemNo));
    }

    public void displayAllItems() {
        int index = 1;
        for (Item item : products) {

            System.out.println("#" + index + " Item Name: " + item.getItemName() + " Item price: "
                    + item.getPrice() +
                    " Item quantity: " + item.getQuantity() + " Item Approve: " + item.getApprove() + " Seller: "
                    + item.getSeller().getuName());
            System.out.println("================================================================================");
            index++;
        }
    }

    public void displayStatistics(){
        System.out.println("\n Your name: " + getuName()+ " Your Email : "+ getuEmail());
        System.out.println("Your Balance: "+ getuBalance());
        System.out.println("Your Products: ");
        displayAllItems();
    }

}
