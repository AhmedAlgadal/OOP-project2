import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    // balance , bought item ,

    // private double balance;
    private ArrayList<Item> boughtItem;
    private Scanner scanner;
    private String selection;
    // private ItemCollections boughtCollections;
    private Invoice invoice;

    public Customer() {
        boughtItem = new ArrayList<Item>();
        scanner = new Scanner(System.in);
    }

    public Customer(int uId, String uName, String uEmail, String uPassword, boolean isActive, double balance) {
        super(uId, uName, uEmail, uPassword, isActive);
        // this.balance= balance;
        boughtItem = new ArrayList<Item>();
        scanner = new Scanner(System.in);
    }

    public void showCustomerBoard() {
        do {
            System.out.println("Customer Interface");
            System.out.println("=================");
            System.out.println("1. Display Orders");
            System.out.println("2. Create Order");
            System.out.println("3. Delete Order");
            System.out.println("4. Display Balance");
            System.out.println("5. Display Invoices");
            System.out.println("6. Rate Seller");
            System.out.println("7. Exit");

            System.out.print("Enter your selection: ");
            selection = scanner.nextLine();
            switch (selection.trim()) {
                case "1":
                    // --------------
                    System.out.println("case 1");

                    break;
                case "2":
                    // ------------------
                    System.out.println();
                    buyProducts();
                    break;
                case "3":
                    // ------------------
                    System.out.println("case 3");
                    break;
                case "4":
                    // ------------------
                    System.out.println("case 4");
                    break;

                case "5":
                    invoice.generateInvoice();

                    System.out.println("case 5");
                    break;
                case "6":
                    // ------------------
                    System.out.println("case 6");
                    break;
                case "7":
                    System.out.println("Exiting Customer Interface...");
                    System.out.println("Exit successful. Good Bye.");
                    return;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("press Enter...");
            scanner.nextLine();
        } while (!selection.equals("7"));
    }

    // public double getBalance() {
    // return balance;
    // }

    // public void setBalance(double balance) {
    // this.balance = balance;
    // }

    public void buyProducts() {
        // -- update the balance and item qut and Seller money ++.
        ItemCollections.displayApproveItems();
        System.out.println("choose Item to buy:");
        int s;
        String g = scanner.nextLine().trim();
        // try and catch block to handle the String input .
        try {
            s = Integer.parseInt(g);
        } catch (Exception e) {
            System.out.println("You have to enter an integer number.");
            return;
        }
        System.out.println("Enter the Quantity of your Item:");
        int quantity;
        String q = scanner.nextLine().trim();
        // try and catch block to handle the String input .
        try {
            quantity = Integer.parseInt(q);
        } catch (Exception e) {
            System.out.println("You have to enter an integer number.");
            return;
        }

        if (ItemCollections.getApproveItems().size() >= s && s > 0) {

            System.out.println("your Item is: " + ItemCollections.getApproveItems(s - 1).getItemName());
            if (quantity > 0 && quantity <= ItemCollections.getApproveItems(s - 1).getQuantity()) {
                double cost = quantity * ItemCollections.getApproveItems(s - 1).getPrice();
                if (cost <= getuBalance()) {
                    Item requiredItem = new Item();
                    requiredItem.setItemNo(ItemCollections.getApproveItems(s - 1).getItemNo());
                    requiredItem.setItemName(ItemCollections.getApproveItems(s - 1).getItemName());
                    requiredItem.setPrice(ItemCollections.getApproveItems(s - 1).getPrice());
                    requiredItem.setQuantity(quantity);
                    addBoughtItem(requiredItem);
                    setuBalance(getuBalance() - cost);
                    ItemCollections.getApproveItems(s - 1)
                            .setQuantity(ItemCollections.getApproveItems(s - 1).getQuantity() - quantity);
                    System.out.println("The payment is successfully done!");
                } else {
                    System.out.println("Insufficent balance!");
                }
            } else {
                System.out.println("Sorry, it is out of stock!");
            }

        } else {
            System.out.println("this product does not exist");
        }

    }

    public void deleteOrder(Item item) {
        // ++ update the balance and item qut and Seller money --.
        this.boughtItem.remove(item);
    }

    public void displayProducts() {
        int index = 1;
        for (Item item : boughtItem) {
            if (item.getQuantity() == 0) {
                System.out.println("#" + index + " " + item.getItemName() + " out of stock");
            } else {
                System.out.println("#" + index + " " + item.getItemName());
            }
            index++;
        }
    }

    public void addBoughtItem(Item boughtItem) {
        this.boughtItem.add(boughtItem);
    }

    public ArrayList<Item> getBoughtItem() {
        return boughtItem;
    }

}