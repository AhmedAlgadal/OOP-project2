public class Main {
    public static void main(String[] args) {

        // XYZShop shop = new XYZShop();
        // shop.getStaring();

        Item i1= new Item("001", "book", 10, 3);
        Item i2= new Item("002", "phone", 500, 10);
        Item i3= new Item("003", "pen", 1, 0);

        Seller seller = new Seller("001", "khald", "khald@ah.com", "111k", true);

        seller.addProducts(i1);
        seller.addProducts(i2);
        seller.addProducts(i2);
        seller.addProducts(i3);

        seller.displayProducts();

        seller.removeProducts(i2);

        // seller.displayProducts();
        
    }
}
