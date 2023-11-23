import java.util.*;
public class Invoice {

        private User customer;
        private User seller;
        private ItemCollections itemCollection;

        public Invoice(User customer, User seller, ItemCollections itemCollection) {

            this.customer = customer;
            this.seller = seller;
            this.itemCollection = itemCollection;
        }

        public double calculateTotal() {
            double total = 0;
            List<Item> items = this.itemCollection.getItems();
            for (Item item : items) {
                total += item.getPrice();
            }
            return total;
        }

        public  String generateInvoice() {
            StringBuilder invoice = new StringBuilder();
            invoice.append("Invoice:\n");
            invoice.append("Seller: ").append(this.seller.getName()).append("\n");
            invoice.append("Customer: ").append(this.customer.getName()).append("\n");
            invoice.append("Items:\n");
            List<Item> items = this.itemCollection.getItems();
            for (Item item : items) {
                invoice.append("- ").append(item.getName()).append(": ").append(item.getPrice()).append("\n");
            }
            invoice.append("Total: ").append(this.calculateTotal());
            return invoice.toString();
        }
    }

