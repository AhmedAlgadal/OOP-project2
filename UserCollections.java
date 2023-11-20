import java.util.ArrayList;

public class UserCollections {
    private static ArrayList<User> users;

    public void storeUser(User user) {
        users = new ArrayList<User>();
        users.add(user);
    }


    public static void displayInactiveUsers() {

        for (User user : users) {
            if (user.getActive()) {
                System.out.println(" User ID: " + user.getuId() + " User Name: " + user.getuName() + " User Email: " +
                        user.getuEmail() +
                        " User Password: " + user.getuPassword() + " User Active: " + user.getActive());
                System.out.println("==================================================");
                System.out.println("\n");
            }
        }

    }

    public static void displayAllUsers() {
        for (User user : users) {

        System.out.println("#" +" User ID: " + user.getuId() + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User Password: " + user.getuPassword() + " User Active: " + user.getActive());
        System.out.println("==================================================");
            }
            }
}







