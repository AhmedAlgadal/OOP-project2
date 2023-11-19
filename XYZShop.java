import java.util.Scanner;
public class XYZShop {
    String name;
    Customer c;
    Seller s;
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
                        System.out.println("Enter your name:");
                        c.setuName(sc2.nextLine());
                        System.out.println("Enter your Email:");
                        //we must check the email format before we set it and must not be empty
                        String uMail = sc2.nextLine();
                        if (uMail.contains(" ") || !(uMail.contains("@") && uMail.contains("."))) {
                            System.out.println(" You should provide a correct email address format. Example: name@email.com");
                            return;
                        }
                        c.setuEmail(uMail);

                        System.out.println("Enter your PassWord:");
                        //must check also the password, cannot be separated by space or be empty
                        String uPassword = sc2.nextLine();
                        if (uPassword.trim().contains(" ")) {
                            System.out.println("You should provide a correct password format. Example: 'Password123'. Not: 'Password 123'.");
                            return;
                        }
                        c.setuPassword(uPassword.trim());
                        System.out.println("Welcome " + c.getuName() + "! " + "Your username is: " + c.getuEmail() + " your password is: " + c.getuPassword());
                    } else if (userType == 2) {
                        System.out.println("Enter your name:");
                        s.setuName(sc2.nextLine());
                        System.out.println("Enter your Email:");
                        s.setuEmail(sc2.nextLine());
                        System.out.println("Enter your PassWord:");
                        s.setuPassword(sc2.nextLine());
                        System.out.println("Welcome " + s.getuName() + "! " + "Your username is: " + s.getuEmail());
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
}