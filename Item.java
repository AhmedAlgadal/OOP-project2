public class Item {

    private int itemNo;
    private String itemName;
    private double price;
    private int quantity;
    private int boughtTimes;
    static int count=1;
    boolean isApprove;


    public Item() {
    }

    public Item(int itemNo, String itemName, double price, int quantity,boolean isApprove) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.isApprove = isApprove;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
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


    public String getName() {
        return  itemName;
    }
    public static int getItemCount() {
        return count++;
    }

    public void setApprove(boolean isApprove) {
        this.isApprove = isApprove;
    }

    public boolean getApprove(){
        return isApprove;
    }

}
