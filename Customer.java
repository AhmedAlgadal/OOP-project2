public class Customer extends User {
    // balance , bought item ,

    private double balance;
    private Item boughtItem;

    public Customer() {
    }

    public Customer(String uId, String uName, String uEmail, String uPassword, boolean isActive) {
        super(uId, uName, uEmail, uPassword, isActive);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Item getBoughtItem() {
        return boughtItem;
    }

    public void setPurchasedItem(Item purchasedItem) {
        this.boughtItem = purchasedItem;
    }
}