public class Item {

    private String itemNo;
    private String itemName;
    private double price;
    private int quantity;
    private int boughtTimes;

    public Item() {
    }

    public Item(String itemNo, String itemName, double price, int quantity) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int BoughtTimes() {
       return boughtTimes ++;
    }


}
