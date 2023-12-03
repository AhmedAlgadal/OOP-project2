import java.util.ArrayList;

public class ItemCollections {
    private static ArrayList<Item> items = new ArrayList<Item>();
    private static ArrayList<Item> approveitems = new ArrayList<Item>();
    
    public ItemCollections() {
        // items = new ArrayList<Item>();
        // approveitems = new ArrayList<Item>();
    }

    public static void storeItem(Item item) {
        items.add(item);
    }

    public static void displayAllItems() {
        int index = 1;
        for (Item item : items) {

            System.out.println("#" + index + " Item Name: " + item.getItemName() + " Item price: "
                    + item.getPrice() +
                    " Item quantity: " + item.getQuantity() + " Item Approve: " + item.getApprove()+ " Seller: "+ item.getSeller().getuName());
            System.out.println("================================================================================");
            index++;
        }
    }

    public static void displayApproveItems() {
        int index = 1;
        for (Item item : items) {
            if (item.getApprove()) {
                System.out.println("#" + index + " Item Name: " + item.getItemName() + " Item price: "
                        + item.getPrice() +
                        " Item quantity: " + item.getQuantity()+" Seller: "+ item.getSeller().getuName());
                System.out.println("======================================================================");
                index++;

            }
        }
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
