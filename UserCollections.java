import java.util.ArrayList;
import java.util.Collections;

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


    public static void displayTop3Seller(){
        ArrayList<Seller> sellers = new ArrayList<>();
        for (User user : getUser()){
            if (user instanceof Seller){
                Seller s = (Seller)user;
                sellers.add(s);
            }
        }

        Collections.sort(sellers, (s1, s2) -> Double.compare(s2.getuBalance(), s1.getuBalance())); 

        if(sellers.size()>= 3){
            int index =1;
            for(int i = 0; i < 3; i++) {
            System.out.println("#"+ index+" Seller Name: " + sellers.get(i).getuName() + ", Balance: " + sellers.get(i).getuBalance());
            index++;
            }
        }else{
            int index =1;
            for(Seller seller : sellers) {
            System.out.println("#"+ index+" Seller Name: " + seller.getuName() + ", Balance: " + seller.getuBalance());
            index++;
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







