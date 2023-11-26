import java.util.ArrayList;

public class UserCollections {
    private static ArrayList<User> users;

    public UserCollections(){
        users = new ArrayList<User>();
    }

    public  void storeUser(User user) {
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
        int index=1;
        for (User user : users) {
            if(user.getuId()!= 123){
        System.out.println("#" + index + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User ID: " +user.getuId()+ " User Active: " + user.getActive());
        System.out.println("==================================================");
        index++;
            }
            }
            }

    public static void displayAllCustomers() {
        int index=1;
        for (User user : users) {
            if (user instanceof Customer){
        System.out.println("#" + index + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User ID: " +user.getuId()+ " User Active: " + user.getActive());
        System.out.println("==================================================");
            }
            }
            }
    public static void displayAllSellers() {
        int index = 1;
        for (User user : users) {
            if(user instanceof Seller){
        System.out.println("#" + index + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User ID: " +user.getuId()+ " User Active: " + user.getActive());
        System.out.println("==================================================");
        }
            }
            }


    public static User getUsers(int n) {
        return users.get(n);
    }

    public static ArrayList<User> getUser(){
        return users;
    }

    public static void removeUser(int userId){
        users.remove(users.get(userId));

    }
}







