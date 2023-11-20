import java.util.ArrayList;

public class Seller extends User {

    private ArrayList<Item> products;
    private double money;

    public Seller() {
        products = new ArrayList<Item>();
    }

    public Seller(String uId, String uName, String uEmail, String uPassword, boolean isActive) {
        super(uId, uName, uEmail, uPassword, isActive);
        products = new ArrayList<Item>();
        money=0;
    }

    public void addProducts(Item item) {
        products.add(item);

    }

    public void removeProducts(Item item) {
        products.remove(item);
    }

    public void displayProducts() {
        int index = 1;
        for (Item item : products) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock " + item.BoughtTimes()+ " times");
            }
            else{
            System.out.println("#" + index + " "+item.getItemName()+" "+ item.BoughtTimes()+ " times");
            }
            index++;
        }
    }

        public void getStatistics() {
        int index = 1;
        for (Item item : products) {
            if(item.getQuantity()==0){
            System.out.println("#" + index + " "+item.getItemName() +" out of stock" + " bought "+ item.BoughtTimes()+ " times");
            }
            else{
                
            System.out.println("#" + index + " "+item.getItemName()+ item.BoughtTimes()+ " times");
            }
            index++;
        }
    }

}
