import java.util.*;
public class Invoice  implements Payable{
    private Customer customer;
    private Seller seller;
    private ItemCollections itemColl;

    Invoice(){
     customer = new Customer();
     seller = new Seller();
     itemColl = new ItemCollections();

    }
    private double getTotal(){
        ArrayList<Item> items = customer.getBoughtItem();
        double total = 0;
        for(Item item : items){
           total += (item.getPrice() /*  item.getQuantity()*/);
        }


        return total;
    }

    @Override
    public double getPay() {
        return getTotal();
    }
}

