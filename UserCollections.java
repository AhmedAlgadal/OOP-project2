import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class UserCollections implements Serializable{
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

    public static String displayAllUsers() {
        StringBuilder SBusers = new StringBuilder();
        int index=1;
        for (User user : users) {
            if(user.getuId()!= 123){
            SBusers.append("#" + index + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User ID: " +user.getuId()+ " User Active: " + user.getActive()+"\n");
            SBusers.append("==================================================\n");
            index++;
            }
        }
        return SBusers.toString();
    }

    public static String displayAllCustomers() {
        StringBuilder customers = new StringBuilder();
        int index=1;
        for (User user : users) {
            if (user instanceof Customer){
            customers.append("#" + index + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
            " User ID: " +user.getuId()+ " User Active: " + user.getActive()+"\n");
            customers.append("==================================================\n");
            index++;
            }
        }
        return customers.toString();
    }

    public static String displayAllSellers() {
        StringBuilder sellers = new StringBuilder();
        int index = 1;
        for (User user : users) {
            if(user instanceof Seller){
            sellers.append("#" + index + " User Name: " + user.getuName() + " User Email: " + user.getuEmail() +
                " User ID: " +user.getuId()+ " User Active: " + user.getActive()+"\n");
            sellers.append("==================================================\n");
            index++;
            }
        }
        return sellers.toString();
    }


    public static String displayTop3Seller(){
        StringBuilder SBsellers = new StringBuilder();
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
            SBsellers.append("#"+ index+" Seller Name: " + sellers.get(i).getuName() + ", Balance: " + sellers.get(i).getuBalance()+"\n");
            index++;
            }
        }else{
            int index =1;
            for(Seller seller : sellers) {
            SBsellers.append("#"+ index+" Seller Name: " + seller.getuName() + ", Balance: " + seller.getuBalance()+"\n");
            index++;
            }

        }
        return SBsellers.toString();
    }


    public static void setUsers(ArrayList<User> users) {
        UserCollections.users = users;
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







