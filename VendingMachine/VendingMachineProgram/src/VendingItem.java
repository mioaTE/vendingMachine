import java.util.HashMap;
import java.util.Map;

public class VendingItem implements Transactionable {
    private String name;
    private double price;
    private String slotID;
    private int quantity = 5;
    private boolean soldOut = false;

//    Map<String, String> vendingItems = new HashMap<>();
//    vendingItems

    // GETTERS

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getSlotID(){
        return slotID;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean isSoldOut(){
        return soldOut;
    }

    // SETTERS

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setSlotID(String slotID){
        this.slotID = slotID;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setSoldOut(boolean soldOut){
        this.soldOut = soldOut;
    }

    // CONSTRUCTOR
    public VendingItem(String name, double price, String slotID){
        this.name = name;
        this.price = price;
        this.slotID = slotID;
        this.quantity = 5;
        this.soldOut = false;
//        itemList.add;
    }

    // METHODS



}