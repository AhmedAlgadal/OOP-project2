import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        // User seller = new Seller(001, "khaldss", "khald@ah.com", "111k", true);
        // User seller1 = new Seller(002, "Maryss", "mr@ah.com", "112k", true);
        // User seller2 = new Seller(003, "Aliss", "ali@ah.com", "113k", false);
        // User seller3 = new Seller(004, "Lanass", "la@ah.com", "114k", false);
        // User c1 = new Customer(001, "khaldcc", "khald@ah.com", "111k", true,1000);
        // User c2 = new Customer(002, "Marycc", "mr@ah.com", "112k", true,544);
        // User c3 = new Customer(003, "Alicc", "ali@ah.com", "113k", false,555);
        // User c4 = new Customer(004, "Lanacc", "la@ah.com", "114k", false,566);
        // UserCollections userColl = new UserCollections();
        // userColl.storeUser(seller);
        // userColl.storeUser(seller1);
        // userColl.storeUser(seller2);
        // userColl.storeUser(seller3);
        // userColl.storeUser(c1);
        // userColl.storeUser(c2);
        // userColl.storeUser(c3);
        // userColl.storeUser(c4);

         Item i1= new Item("001", "book", 10, 3);
          Item i2= new Item("002", "phone", 500, 10);
          Item i3= new Item("003", "pen", 1, 0);
        ItemCollections itemColl = new ItemCollections();
        itemColl.storeItem(i1);
        itemColl.storeItem(i2);
        itemColl.storeItem(i3);
        

        Admin admin = new Admin();

        // shop.shopBoard();
        admin.adminBoard();
        // c1.CustomerBoard();
        // seller.sellerBoard();
        
        // System.out.println(" Active Users");
        // admin.displayAllUsers();

        // System.out.println(" Inactive Users");
        // admin.displayInactiveUsers();
//          try {
//       File myObj = new File("admin_credentials.txt");
//       Scanner myReader = new Scanner(myObj);
//       while (myReader.hasNextLine()) {
//         String data = myReader.nextLine();
//         System.out.println(data);
//       }
//       myReader.close();
//     } catch (FileNotFoundException e) {
//       System.out.println("An error occurred.");
//       e.printStackTrace();
//     }
//   }

}  
}
