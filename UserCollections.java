import java.util.ArrayList;

public class UserCollections {
    private static ArrayList<User> users;

    public UserCollections(){
        users = new ArrayList<User>();
    }

    public void storeUser(User user) {
        users.add(user);
    }


    public static void displayInactiveUsers() {

        for (User user : users) {
            if (!user.getActive()) {
                System.out.println(" User ID: " + user.getuId() + " User Name: " + user.getuName() + " User Email: " +
                        user.getuEmail() +
                        " User Password: " + user.getuPassword() + " User Active: " + user.getActive());
                System.out.println("==================================================");
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
    public static void displayAllCustomers() {
        for (User user : users) {
            if (user instanceof Customer){
        System.out.println("#" +" User ID: " + user.getuId() + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User Password: " + user.getuPassword() + " User Active: " + user.getActive());
        System.out.println("==================================================");
            }
            }
            }
    public static void displayAllSellers() {
        for (User user : users) {
            if(user instanceof Seller){
        System.out.println("#" +" User ID: " + user.getuId() + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User Password: " + user.getuPassword() + " User Active: " + user.getActive());
        System.out.println("==================================================");
        }
            }
            }


    public static User getUsers(int n) {
        return users.get(n);
    }
}







