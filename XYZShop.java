import java.util.Scanner;

public class XYZShop {
    String name;
    User c;
    User s;
    Scanner sc1;
    Scanner sc2;

    public XYZShop() {
        c = new Customer();
        s = new Seller();
        sc1 = new Scanner(System.in);
        sc2 = new Scanner(System.in);
    }

    void getStaring() {
        System.out.println("Register as: ");
        System.out.println("1.Customer  2.Seller");
        while (true) {
            try {
                String option = sc1.next();
                int userType = Integer.parseInt(option);
                if (userType == 1 || userType == 2) {
                    if (userType == 1) {
                        Register(c);
                    } else if (userType == 2) {
                        Register(s);
                    }
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }

        }
    }

    void Register(User u) {
        System.out.println("Enter your name:");
        String uName = sc2.nextLine();
        if(uName.trim().isEmpty()){
            System.out.println("Your name must not be null");
            return;
        }
        u.setuName(uName.trim());
        System.out.println("Enter your Email:");
        // we must check the email format before we set it and must not be empty
        String uMail = sc2.nextLine();
        if (uMail.contains(" ") || !(uMail.contains("@") && uMail.contains("."))) {
            System.out.println(" You should provide a correct email address format. Example: name@email.com");
            return;
        }
        u.setuEmail(uMail);

        System.out.println("Enter your PassWord:");
        // must check also the password, cannot be separated by space or be empty
        String uPassword = sc2.nextLine();
        if (uPassword.trim().contains(" ")) {
            System.out.println(
                    "You should provide a correct password format. Example: 'Password123'. Not: 'Password 123'.");
            return;
        }
        u.setuPassword(uPassword.trim());
        System.out.println("Welcome " + u.getuName() + "! " + "Your username is: " + u.getuEmail()
                + " your password is: " + u.getuPassword());

    }
}