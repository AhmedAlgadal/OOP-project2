public class Main {
    public static void main(String[] args) {

/*        // XYZShop shop = new XYZShop();
        // shop.getStaring();

        Item i1= new Item("001", "book", 10, 3);
        Item i2= new Item("002", "phone", 500, 10);
        Item i3= new Item("003", "pen", 1, 0);

        Seller seller = new Seller("001", "khald", "khald@ah.com", "111k", true);

        Customer customer = new Customer("c001", "ahmed", "ahmed@a.com", "144a", true, 5000);
        customer.buyProducts(i1);
        customer.buyProducts(i2);

        seller.addProducts(i1);
        seller.addProducts(i2);
        seller.addProducts(i2);
        seller.addProducts(i3);
        
        seller.displayProducts();
        // customer.displayProducts();

        // seller.removeProducts(i2);
        // seller.displayProducts();*/
        Seller seller = new Seller("001", "khald", "khald@ah.com", "111k", true);
        Seller seller1 = new Seller("002", "Mary", "mr@ah.com", "112k", true);
        Seller seller2 = new Seller("003", "Ali", "ali@ah.com", "113k", false);
        Seller seller3 = new Seller("004", "Lana", "la@ah.com", "114k", false);
        UserCollections userColl = new UserCollections();
        userColl.storeUser(seller);
        userColl.storeUser(seller1);
        userColl.storeUser(seller2);
        userColl.storeUser(seller3);



        Admin admin = new Admin("123", "Admin","admin@xyz.com", "root");
       // admin.adminBoard();
        System.out.println(" Active Users");
        admin.displayAllUsers();

        System.out.println(" Inactive Users");
        admin.displayInactiveUsers();



    }
}
