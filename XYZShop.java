import java.util.InputMismatchException;
import java.util.Scanner;

public class XYZShop {
    String name;
    User customer;
    User seller;
    Scanner scanner;
    Scanner scanner2;
    Scanner scanner3;
    String selection;
    UserCollections userColl;

    public XYZShop() {
        customer = new Customer();
        seller = new Seller();
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
        scanner3 = new Scanner(System.in);
        userColl= new UserCollections();
    }

    public void shopBoard() {
        do {
            System.out.println("XYZ Shop Interface");
            System.out.println("=================");
            System.out.println("1. Log in");
            System.out.println("2. log out");
            System.out.println("3. Register");

            System.out.print("Enter your selection: ");
            selection = scanner.nextLine();

            switch (selection.trim()) {
                case "1":
                    // --------------
                    System.out.println("case 1");
                    break;
                case "2":
                    System.out.println("Exiting Shop Interface...");
                    System.out.println("Exit successful. Good Bye.");
                    break;
                case "3":
                    // ------------------
                    getStarting();
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }
            System.out.println("press Enter...");
            scanner3.nextLine();
        } while (!selection.equals("2"));
    }

    void getStarting() {
        System.out.println("Register as: ");
        System.out.println("1.Customer  2.Seller");
        while (true) {
            try {
                String option = scanner.next();
                int userType = Integer.parseInt(option);
                if (userType == 1 || userType == 2) {
                    if (userType == 1) {
                        Register(customer);
                    } else if (userType == 2) {
                        Register(seller);
                    }
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                break;
            }

        }
    }

    void Register(User u) {
        System.out.println("Enter your name:");
        String uName = scanner2.nextLine();
        if (uName.trim().isEmpty()) {
            System.out.println("Your name must be not null");
            return;
        }
        u.setuName(uName.trim());
        System.out.println("Enter your Email:");
        // we must check the email format before we set it and must not be empty
        String uMail = scanner2.nextLine();
        if (uMail.contains(" ") || !(uMail.contains("@") && uMail.contains("."))) {
            System.out.println(" You should provide a correct email address format. Example: name@email.com");
            return;
        }
        u.setuEmail(uMail);

        System.out.println("Enter your PassWord:");
        // must check also the password, cannot be separated by space or be empty
        String uPassword = scanner2.nextLine();
        if (uPassword.trim().contains(" ")) {
            System.out.println(
                    "You should provide a correct password format. Example: 'Password123'. Not: 'Password 123'.");
            return;
        }
        u.setuPassword(uPassword.trim());
        u.setuId(User.getCount());
        System.out.println("Welcome " + u.getuName() + "! " + "Your username is: " + u.getuEmail()
                + " your password is: " + u.getuPassword());
        System.out.println("Your ID is: "+ u.getuId());

        userColl.storeUser(u);
    }
}