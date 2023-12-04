import java.io.*;
import java.util.*;

public class XYZShop {
    String name;
    Customer customer;
    Seller seller;
    Scanner scanner;
    String selection;
    UserCollections userColl;
    Admin admin;

    public XYZShop() {
        customer = new Customer();
        seller = new Seller();
        scanner = new Scanner(System.in);
        userColl = new UserCollections();
        admin = new Admin();
        readUsers();
        readItems();

        userColl.storeUser(admin.setAdminCredentials());
    }

    public void showShopBoard() {
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
                    break;
                case "2":
                    writeUsers();
                    writeItems();
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
            scanner.nextLine();
        } while (!selection.equals("2"));
    }

    void getStarting() {
        System.out.println("Register as: ");
        System.out.println("1.Customer  2.Seller");
        while (true) {
            try {
                String option = scanner.nextLine();
                int userType = Integer.parseInt(option);
                if (userType == 1 || userType == 2) {
                    if (userType == 1) {
                        customer = new Customer();
                        Register(customer);
                    } else if (userType == 2) {
                        seller = new Seller();
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
        String uName = scanner.nextLine();
        if (uName.trim().isEmpty()) {
            System.out.println("Your name must be not null");
            return;
        }
        // ------------------
        u.setuName(uName.trim());
        System.out.println("Enter your Email:");
        // we must check the email format before we set it and must not be empty
        String uMail = scanner.nextLine();
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
        String uPassword = scanner.nextLine();
        if (uPassword.trim().contains(" ") || uPassword.trim().isEmpty()) {
            System.out.println(
                    "Your password must be not null,or you should provide a correct password format. Example: 'Password123'. Not: 'Password 123'.");
            return;
        }
        u.setuPassword(uPassword.trim());
        u.setuId(User.getCount());
        System.out.println("Welcome " + u.getuName() + "! " + "Your username is: " + u.getuEmail()
                + " your password is: " + u.getuPassword());
        System.out.println("Your ID is: " + u.getuId());

        userColl.storeUser(u);
    }

    public void login() {
        System.out.println("Enter your Email:");
        String email = scanner.nextLine();
        System.out.println("Enter your Password:");
        String password = scanner.nextLine();


        boolean found = false;
        for (User user : UserCollections.getUser()) {
            if (user.getuEmail().equals(email) && user.getuPassword().equals(password)) {
                found = true;
                if (user instanceof Customer && user.getActive() ) {
                    Customer c = (Customer) user;
                    c.showCustomerBoard();
                } else if (user instanceof Seller && user.getActive()) {
                    Seller s = (Seller) user;
                    s.showSellerBoard();
                } else if (user instanceof Admin) {
                    admin.showAdminBoard();
                }else if(!user.getActive()){
                    System.out.println("Please wait you not Active yet,The Admin will Activate you soon.");
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

    public void writeUsers() {
        ArrayList<User> writeUsers = UserCollections.getUser();

        try {
            FileOutputStream fileout = new FileOutputStream("UsersInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(writeUsers);
            fileout.close();
            out.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void writeItems() {
        ArrayList<Item> writeItems = ItemCollections.getItems();
        try {
            FileOutputStream fileout = new FileOutputStream("ItemsInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(writeItems);
            fileout.close();
            out.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void readUsers() {
        try {
            FileInputStream filein = new FileInputStream("UsersInfo.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            ArrayList<User> users = (ArrayList<User>) in.readObject();

            UserCollections.setUsers(users);
            System.out.println("Success");
            filein.close();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void readItems() {
        try {
            FileInputStream filein = new FileInputStream("ItemsInfo.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            ArrayList<Item> items = (ArrayList<Item>) in.readObject();

            ItemCollections.setItems(items);
            System.out.println("Success");
            filein.close();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}