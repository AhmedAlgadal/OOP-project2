
public class Main {
  public static void main(String[] args) {

        // XYZShop shop = new XYZShop();
        // shop.showShopBoard();
        // Admin admin = new Admin();
        // admin.adminBoard();
        // Seller s = new Seller();
        // s.sellerBoard();

        Item i1 = new Item(1, "aaa", 10, 1, true);
        Item i2 = new Item(2, "bbb", 20, 2, false);
        Item i3 = new Item(3, "ccc", 30, 3, true);
        Item i4 = new Item(4, "ddd", 40, 4, false);
        Item i5 = new Item(5, "eee", 50, 0, true);

        ItemCollections itemColl = new ItemCollections();
        itemColl.storeItem(i1);
        itemColl.storeItem(i2);
        itemColl.storeItem(i3);
        itemColl.storeItem(i4);
        itemColl.storeItem(i5);
        ItemCollections.addApprovedItem(i1);
        ItemCollections.addApprovedItem(i3);
        ItemCollections.addApprovedItem(i5);
        Customer c = new Customer(111, "cc1", "cc1@.", "111", true, 20);
        c.showCustomerBoard();
        // ItemCollections.displayApproveItems();
        System.out.println(ItemCollections.getApproveItems().size());

        }
}
