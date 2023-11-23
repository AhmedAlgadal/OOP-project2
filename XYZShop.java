import java.util.Scanner;

public class XYZShop {
    String name;
    Customer customer;
    Seller seller;
    Scanner scanner;
    Scanner scanner2;
    Scanner scanner3;
    String selection;
    UserCollections userColl;
    Admin admin;

    public XYZShop() {
        customer = new Customer();
        seller = new Seller();
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
        scanner3 = new Scanner(System.in);
        userColl = new UserCollections();
        admin = new Admin();
        
        userColl.storeUser(admin.setAdminCredentials());
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
                      login();
                    // admin.adminBoard();
                    break;
                case "2":
                    logout();
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
        if (uName.trim().isEmpty() ) {
            System.out.println("Your name must be not null");
            return;
        }
        //------------------
        u.setuName(uName.trim());
        System.out.println("Enter your Email:");
        // we must check the email format before we set it and must not be empty
        String uMail = scanner2.nextLine();
        if (uMail.contains(" ") || !(uMail.contains("@") && uMail.contains("."))) {
            System.out.println(" You should provide a correct email address format. Example: name@email.com");
            return;
        }
        for (User user : UserCollections.getUser()) {
            if (user.getuEmail().equals(uMail)) {
                System.out.println("This email is already taken. Please choose a different one.");
                return;
            }
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
        System.out.println("Your ID is: " + u.getuId());

        userColl.storeUser(u);
    }

    // public void login() {
    // System.out.println("Enter your User name:");
    // String name = scanner.nextLine();
    // System.out.println("Enter your Password:");
    // String password = scanner.nextLine();

    // if (name.equals("admin") && password.equals("root")) {
    // admin.adminBoard();
    // return;
    // }
    // for (User user : UserCollections.users) {
    // if (user.getuName().equals(name) && user.getuPassword().equals(password) &&
    // user instanceof Customer && user.getActive()) {
    // customer.CustomerBoard();
    // } else if (user.getuName().equals(name) &&
    // user.getuPassword().equals(password) && user instanceof Seller) {
    // seller.sellerBoard();
    // } else {
    // System.out.println("Wrong Username or password");
    // }
    // }

    // }
    public void login() {
        System.out.println("Enter your Email:");
        String email = scanner.nextLine();
        System.out.println("Enter your Password:");
        String password = scanner.nextLine();

        // if (email.equals("admin1@xyzshop.com") && password.equals("root")) {
        //     admin.adminBoard();
        //     return;
        // }

        boolean found = false;
        for (User user : UserCollections.getUser()) {
            if (user.getuEmail().equals(email) && user.getuPassword().equals(password)) {
                found = true;
                if (user instanceof Customer/* && user.getActive()*/) {
                    customer.CustomerBoard();
                } else if (user instanceof Seller) {
                    seller.sellerBoard();
                }else if (user instanceof Admin){
                    admin.adminBoard();
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Wrong Email or password");
        }
    }
    public void logout() {

                System.out.println("Logout successful. Thank you for your valuable contributions.");
                System.exit(0);

    }


}