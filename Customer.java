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

    public void buyProducts(Item item){
        // -- update the balance and item qut and Seller money ++.
        this.boughtItem.add(item);
        item.BoughtTimes();
        // seller.money++;
    }

    public void deleteOrder(Item item){
        //++ update the balance and item qut and Seller money --.
        this.boughtItem.remove(item);
    }

    public void displayProducts() {
        int index = 1;
        for (Item item : boughtItem) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock");
            }
            else{
            System.out.println("#" + index + " "+item.getItemName());
            }
            index++;
        }
    }



    
}