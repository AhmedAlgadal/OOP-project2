import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Seller extends User {

    private ArrayList<Item> products;
    private double money;
    private Scanner scanner;
    private Scanner scanner2;
    private String selection;

    public Seller() {
        products = new ArrayList<Item>();
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
    }

    public Seller(int uId, String uName, String uEmail, String uPassword, boolean isActive) {
        super(uId, uName, uEmail, uPassword, isActive);
        products = new ArrayList<Item>();
        money=0;
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
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
                    System.out.println("Exiting Seller Interface...");
                    System.out.println("Exit successful. Good Bye.");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("press Enter...");
            scanner2.nextLine();
        } while (!selection.equals("5"));
    }

    public void addProducts(Item item) {
        products.add(item);

    }

    public void removeProducts(Item item) {
        products.remove(item);
    }

    public void displayProducts() {
        int index = 1;
        for (Item item : products) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock " + item.BoughtTimes()+ " times");
            }
            else{
            System.out.println("#" + index + " "+item.getItemName()+" "+ item.BoughtTimes()+ " times");
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

}
