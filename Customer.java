import java.util.ArrayList;

public class Customer extends User {
    // balance , bought item ,

    private double balance;
    private ArrayList<Item> boughtItem;

    public Customer() {
        boughtItem= new ArrayList<Item>();
    }

    public Customer(String uId, String uName, String uEmail, String uPassword, boolean isActive, double balance) {
        super(uId, uName, uEmail, uPassword, isActive);
        this.balance= balance;
        boughtItem= new ArrayList<Item>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    
}