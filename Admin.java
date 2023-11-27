import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Admin extends User {

    Scanner scanner = new Scanner(System.in);
    String selection;

    public Admin() {
        setActive(true);
    }

    public Admin(int uId, String uName, String uEmail, String uPassword, boolean isActive) {
        super(uId, uName, uEmail, uPassword);
        isActive = true;
    }

    public void showAdminBoard() {
        do {
            System.out.println("Admin Interface");
            System.out.println("=================");
            System.out.println("1. Activate User");
            System.out.println("2. Display Unactive Users");
            System.out.println("3. Display All Products");
            System.out.println("4. Display All Users");
            System.out.println("5. Display Customers");
            System.out.println("6. Display Sellers");
            System.out.println("7. Approve Products");
            System.out.println("8. Remove Users");
            System.out.println("9. Remove Products");
            System.out.println("10. Display Statistics");
            System.out.println("11. Exit");

            System.out.print("Enter your selection: ");
            selection = scanner.nextLine();
            switch (selection.trim()) {
                case "1":
                    activateUser();
                    break;
                case "2":
                    displayInactiveUsers();
                    break;
                case "3":
                    displayAllProducts();
                    break;
                case "4":
                    displayAllUsers();
                    break;
                case "5":
                    displayCustomers();
                    break;
                case "6":
                    displaySellers();
                    break;
                case "7":
                    approveProducts();
                    break;
                case "8":
                    removeUsers();
                    break;
                case "9":
                    removeProducts();
                    break;
                case "10":
                    displayStatistics();
                    break;
                case "11":
                    System.out.println("Exiting Admin Interface...");
                    System.out.println("Exit successful. Good Bye.");
                    return;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("press Enter...");
            scanner.nextLine();
        } while (!selection.equals("11"));
    }

    private void activateUser() {
        // Implement code to activate a user
        UserCollections.displayAllUsers();
        System.out.println("Choose the User number to activate it:");
        int s;
        String g = scanner.nextLine().trim();
        // try and catch block to handle the String input .
        try {
            s = Integer.parseInt(g);
        } catch (Exception e) {
            System.out.println("You have to enter an integer number.");
            return;
        }
        if (UserCollections.getUser().size() > s && s > 0) {

            UserCollections.getUsers(s).setActive(true);
            System.out.println(UserCollections.getUsers(s).getuName()
                    + " is now active");
            System.out.println(UserCollections.getUsers(s).getActive());
        } else {
            System.out.println("that User does not exist");
        }
    }

    public void displayInactiveUsers() {

        UserCollections.displayInactiveUsers();

    }

    public void displayAllProducts() {
        // Implement code to display all products
        ItemCollections.displayAllItems();
    }

    public void displayAllUsers() {

        UserCollections.displayAllUsers();
    }

    public void displayCustomers() {
        // Implement code to display customers
        UserCollections.displayAllCustomers();
    }

    public void displaySellers() {
        // Implement code to display sellers
        UserCollections.displayAllSellers();
    }

    public void approveProducts() {
        // Implement code to approve products
        ItemCollections.displayAllItems();
        System.out.println("Choose the Item number to approve it:");
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

            ItemCollections.getItems(s - 1).setApprove(true);
            System.out.println(ItemCollections.getItems(s - 1).getItemName() + " is now approved");
            System.out.println(ItemCollections.getItems(s - 1).getApprove());
        } else {
            System.out.println("this product does not exist");
        }
    }

    public void removeUsers() {
        // Implement code to remove users
        UserCollections.displayAllUsers();
        System.out.println("Choose the User ID to remove it:");
        int s;
        String g = scanner.nextLine().trim();
        // try and catch block to handle the String input .
        try {
            s = Integer.parseInt(g);
        } catch (Exception e) {
            System.out.println("You have to enter an integer number.");
            return;
        }
        if (UserCollections.getUser().size() > s && s > 0) {
            System.out.println(UserCollections.getUsers(s).getuName()
                    + " is now removed");
            UserCollections.removeUser(s);
        } else {
            System.out.println("that User does not exist");
        }
    }

    public void removeProducts() {
        // Implement code to remove products
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

    public void displayStatistics() {
        // Implement code to display statistics
        System.out.println("\nImplement code to display statistics\n");
    }

    public Admin setAdminCredentials() {
        Admin admin = new Admin();
        try {
            File file = new File("admin_credentials.txt"); // replace with your file path
            Scanner sca = new Scanner(file);

            if (sca.hasNextLine()) {
                admin.setuId(sca.nextInt());
                sca.nextLine(); // consume newline left-over
            }
            if (sca.hasNextLine()) {
                admin.setuName(sca.nextLine());
            }
            if (sca.hasNextLine()) {
                admin.setuEmail(sca.nextLine());
            }
            if (sca.hasNextLine()) {
                admin.setuPassword(sca.nextLine());
            }

            sca.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return admin;
    }
}
