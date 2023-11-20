import java.util.*;

public class Admin extends User {

    Scanner scanner = new Scanner(System.in);
    int selection;

    public Admin(String uId, String uName, String uEmail, String uPassword) {
        super(uId, uName, uEmail, uPassword);
    }

    public void adminBoard() {
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
            // selection = scanner.nextInt();
            boolean validInput = false;
            while (!validInput) {
                try {
                    selection = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.nextLine(); // Consume the remaining input line
                }
            }
            switch (selection) {
                case 1:
                    activateUser();
                    break;
                case 2:
                    displayInactiveUsers();
                    break;
                case 3:
                    displayAllProducts();
                    break;
                case 4:
                    displayAllUsers();
                    break;
                case 5:
                    displayCustomers();
                    break;
                case 6:
                    displaySellers();
                    break;
                case 7:
                    approveProducts();
                    break;
                case 8:
                    removeUsers();
                    break;
                case 9:
                    removeProducts();
                    break;
                case 10:
                    displayStatistics();
                    break;
                case 11:
                    System.out.println("Exiting Admin Interface...");
                    System.out.println("Exit successful. Good Bye.");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        } while (selection != 11);
    }

    private static void activateUser() {
        // Implement code to activate a user
        System.out.println("\nImplement code to activate a user.\n");
    }

    public void displayInactiveUsers() {

        UserCollections.displayInactiveUsers();

    }

    public void displayAllProducts() {
        // Implement code to display all products
        System.out.println("\nImplement code to display all products\n");

    }

    public void displayAllUsers() {

        UserCollections.displayAllUsers();
    }

    public void displayCustomers() {
        // Implement code to display customers
        System.out.println("\nImplement code to display customers\n");
    }

    public void displaySellers() {
        // Implement code to display sellers
        System.out.println("\nImplement code to display sellers\n");
    }

    public void approveProducts() {
        // Implement code to approve products
        System.out.println("\nImplement code to approve products\n");
    }

    public void removeUsers() {
        // Implement code to remove users
        System.out.println("\nImplement code to remove users\n");
    }

    public void removeProducts() {
        // Implement code to remove products
        System.out.println("\nImplement code to remove products\n");
    }

    public void displayStatistics() {
        // Implement code to display statistics
        System.out.println("\nImplement code to display statistics\n");
    }
}
