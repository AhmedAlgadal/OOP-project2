import java.util.*;
public class Invoice  implements Payable{

        private User customer;
        private User seller;
        private ItemCollections itemCollection;
        // private boolean isPaid;
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
        public void updateCustomerBalance(double amount) {
        if (customer.getuBalance() >= amount) {
            customer.setuBalance(customer.getuBalance() - amount);
            System.out.println("Customer's balance updated successfully.");
        } else {
            System.out.println("Insufficient balance to update customer's balance.");
        }
    }
        public boolean hasSufficientBalance(double amount) {
            return customer.getuBalance() >= amount;
        }
//    public void markInvoiceAsPaid() {
//        this.isPaid = true;
//        System.out.println("Invoice paid successfully.");
//    }

        public  String generateInvoice() {
            StringBuilder invoice = new StringBuilder();
            invoice.append("Invoice:\n");
            invoice.append("Seller: ").append(this.seller.getuName()).append("\n");
            invoice.append("Customer: ").append(this.customer.getuName()).append("\n");
            invoice.append("Items:\n");
            List<Item> items = this.itemCollection.getItems();
            for (Item item : items) {
                invoice.append("- ").append(item.getName()).append(": ").append(item.getPrice()).append("\n");
            }
            invoice.append("Total: ").append(this.calculateTotal());
            return invoice.toString();
        }

        public double getPay(){
            return calculateTotal();
        }
    }

