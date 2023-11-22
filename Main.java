public class Main {
    public static void main(String[] args) {

        /*
         * //
         * // shop.getStaring();
         * 
         * 
         * Seller seller = new Seller("001", "khald", "khald@ah.com", "111k", true);
         * 
         * true, 5000);
         * customer.buyProducts(i1);
         * customer.buyProducts(i2);
         * 
         * seller.addProducts(i1);
         * seller.addProducts(i2);
         * seller.addProducts(i2);
         * seller.addProducts(i3);
         * 
         * seller.displayProducts();
         * // customer.displayProducts();
         * 
         * // seller.removeProducts(i2);
         * // seller.displayProducts();
         */
        XYZShop shop = new XYZShop();
        // Seller seller = new Seller("001", "khaldss", "khald@ah.com", "111k", true);
        // Seller seller1 = new Seller("002", "Maryss", "mr@ah.com", "112k", true);
        // Seller seller2 = new Seller(003, "Aliss", "ali@ah.com", "113k", false);
        // Seller seller3 = new Seller("004", "Lanass", "la@ah.com", "114k", false);
        // Customer c1 = new Customer("001", "khaldcc", "khald@ah.com", "111k", true,1000);
        // Customer c2 = new Customer("002", "Marycc", "mr@ah.com", "112k", true,544);
        // Customer c3 = new Customer("003", "Alicc", "ali@ah.com", "113k", false,555);
        // Customer c4 = new Customer("004", "Lanacc", "la@ah.com", "114k", false,566);
        // UserCollections.storeUser(seller);
        // UserCollections.storeUser(seller1);
        // UserCollections.storeUser(seller2);
        // UserCollections.storeUser(seller3);
        // UserCollections.storeUser(c1);
        // UserCollections.storeUser(c2);
        // UserCollections.storeUser(c3);
        // UserCollections.storeUser(c4);

         Item i1= new Item("001", "book", 10, 3);
          Item i2= new Item("002", "phone", 500, 10);
          Item i3= new Item("003", "pen", 1, 0);
        ItemCollections itemColl = new ItemCollections();
        itemColl.storeItem(i1);
        itemColl.storeItem(i2);
        itemColl.storeItem(i3);
        

        Admin admin = new Admin(123, "Admin", "admin@xyz.com", "root");

        shop.shopBoard();
        // admin.adminBoard();
        // c1.CustomerBoard();
        // seller.sellerBoard();
        
        // System.out.println(" Active Users");
        // admin.displayAllUsers();

        // System.out.println(" Inactive Users");
        // admin.displayInactiveUsers();

    }
}
