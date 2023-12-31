import java.io.Serializable;
import java.util.ArrayList;

public class ItemCollections implements Serializable{
    private static ArrayList<Item> items = new ArrayList<Item>();
    private static ArrayList<Item> approveitems = new ArrayList<Item>();
    

    public static void storeItem(Item item) {
        items.add(item);
    }

    public static String displayAllItems() {
        StringBuilder SBitems = new StringBuilder();
        int index = 1;
        for (Item item : items) {

            SBitems.append("#" + index + " Item Name: " + item.getItemName() + " Item price: "
                    + item.getPrice() +
                    " Item quantity: " + item.getQuantity() + " Item Approve: " + item.getApprove()+ " Seller: "+ item.getSeller().getuName()+"\n");
            SBitems.append("================================================================================\n");
            index++;
        }
        return SBitems.toString();
    }

    public static String displayApproveItems() {
        StringBuilder SBitems = new StringBuilder();
        int index = 1;
        for (Item item : items) {
            if (item.getApprove()) {
                SBitems.append("#" + index + " Item Name: " + item.getItemName() + " Item price: "
                        + item.getPrice() +
                        " Item quantity: " + item.getQuantity()+" Seller: "+ item.getSeller().getuName()+"\n");
                SBitems.append("======================================================================\n");
                index++;

            }
        }
        return SBitems.toString();
    }

    public static void setItems(ArrayList<Item> items) {
        ItemCollections.items = items;
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static Item getItems(int n) {
        return items.get(n);
    }

    public static ArrayList<Item> getApproveItems() {
        return approveitems;
    }

    public static Item getApproveItems(int n) {
        return approveitems.get(n);
    }


    public static void removeItem(int itemNo) {
        items.remove(getItems(itemNo));
    }

    public static void removeApproveItem(int itemNo) {
        approveitems.remove(getApproveItems(itemNo));
    }

    public static void addApprovedItem(Item item) {
            approveitems.add(item);
    }
    
}
