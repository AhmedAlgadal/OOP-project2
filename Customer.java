import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer extends User {
    // balance , bought item ,

    private double balance;
    private ArrayList<Item> boughtItem;
    private Scanner scanner;
    private Scanner scanner2;
    private String selection;


    public Customer() {
        boughtItem= new ArrayList<Item>();
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
    }

    public Customer(int uId, String uName, String uEmail, String uPassword, boolean isActive, double balance) {
        super(uId, uName, uEmail, uPassword, isActive);
        this.balance= balance;
        boughtItem= new ArrayList<Item>();
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
    }

    public void CustomerBoard() {
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
            selection= scanner.nextLine();
            switch (selection.trim()) {
                case "1":
                //--------------
                System.out.println("case 1");

                    break;
                case "2":
                // ------------------
                System.out.println("case 2");
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
                // ------------------
                System.out.println("case 5");
                    break;
                case "6":
                // ------------------
                System.out.println("case 6");
                    break;
                case "7":
                    System.out.println("Exiting Customer Interface...");
                    System.out.println("Exit successful. Good Bye.");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("press Enter...");
            scanner2.nextLine();
        } while (!selection.equals("7"));
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void buyProducts(Item item){
        // -- update the balance and item qut and Seller money ++.
        this.boughtItem.add(item);
        item.BoughtTimes();
        // seller.money++;
    }

    public void deleteOrder(Item item){
        //++ update the balance and item qut and Seller money --.
        this.boughtItem.remove(item);
    }

    public void displayProducts() {
        int index = 1;
        for (Item item : boughtItem) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock");
            }
            else{
            System.out.println("#" + index + " "+item.getItemName());
            }
            index++;
        }
    }



    
}