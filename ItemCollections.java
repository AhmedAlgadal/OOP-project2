import java.util.ArrayList;

public class ItemCollections {
    private static ArrayList<Item> items;

    public ItemCollections() {
        items = new ArrayList<Item>();
    }

    public void storeItem(Item item) {
        items.add(item);
    }

    public static void displayAllItems() {
        for (Item item: items) {

            System.out.println("#" + " Item number: " + item.getItemNo() + " Item Name: " + item.getItemName() + " Item price: "
                    + item.getPrice() +
                    " Item quantity: " + item.getQuantity() );
            System.out.println("==================================================");
        }
    }

    public static Item getUsers(int n) {
        return items.get(n);
    }
}
