import java.util.ArrayList;

public class ItemCollections {
    private static ArrayList<Item> items;

    public ItemCollections() {
        items = new ArrayList<Item>();
    }

    public  void storeItem(Item item) {
        items.add(item);
    }

    public static void displayAllItems() {
        int index=1 ;
        for (Item item: items) {

            System.out.println("#" + index + " Item Name: " + item.getItemName() + " Item price: "
                    + item.getPrice() +
                    " Item quantity: " + item.getQuantity()+ " Item Approve: "+ item.getApprove() );
            System.out.println("==================================================");
            index++;
        }
    }

    // public static void displayUnapproveItems() {
    //     for (Item item: items) {
    //         if(!item.getApprove()){
    //         System.out.println("#" + " Item number: " + item.getItemNo() + " Item Name: " + item.getItemName() + " Item price: "
    //                 + item.getPrice() +
    //                 " Item quantity: " + item.getQuantity()+ "Item Approve "+ item.getApprove() );
    //         System.out.println("==================================================");
    //         }
    //     }
    // }

    public static Item getItems(int n) {
        return items.get(n);
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void removeItem(int itemNo){
        items.remove(items.get(itemNo));
    }
}
