import java.util.*;
public class Invoice  implements Payable{
    private Customer customer;
    private Seller seller;
    private ItemCollections itemColl;

    Invoice(Customer customer){
    //  customer = new Customer();
    this.customer = customer;
    //  seller = new Seller();
    // itemColl = new ItemCollections();

    }

    public String getInvoice(){
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice \n");
        invoice.append("-----------------------\n");
        invoice.append("The Customer: "+ customer.getuName()+"\n");
        ArrayList<Item> items = customer.getBoughtItem();
        int index =1;
        for(Item item : items){
            invoice.append("#" + index + " Item Name: " + item.getItemName() + " Item price: "
                    + item.getPrice() +
                    " Item quantity: " + item.getQuantity() + " Item Seller "+ item.getSeller().getuName()+"\n");
            invoice.append("====================================================================\n");
            index++;
        }
        invoice.append("The Total : "+ getPay());

        return invoice.toString();
    }

    private double getTotal(){
        ArrayList<Item> items = customer.getBoughtItem();
        double total = 0;
        for(Item item : items){
           total += (item.getPrice() *  item.getQuantity());
        }


        return total;
    }

    @Override
    public double getPay() {
        return getTotal();
    }
}

