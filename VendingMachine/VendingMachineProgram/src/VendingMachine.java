import java.util.ArrayList;
import java.util.List;

public class VendingMachine {




    List<VendingItem> itemList; // List of available products to purchase
    public double amountOfMoneyStored; // Change to give back stored in the machine
    private double balanceInserted; // The amount of money inserted by the user
    private double balanceRequired; // The amount of money required to purchase a VendingItem
    private TransactionLog transactionLog; // Stores the transactions that occur

    public VendingMachine(List itemList, double balanceInserted, double balanceRequired, TransactionLog transactionLog){
        this.itemList = new ArrayList<>();
        this.balanceInserted = balanceInserted;
        this.balanceRequired = 0.0;
        this.amountOfMoneyStored = 100.0;
//        this.transactionLog +=;
    }
    public void addItem(VendingItem item) {
        itemList.add(item);
    }
    public static void displayItems() {
        for (VendingItem item : itemList){
            System.out.println(item.getSlotID() + " | " + item.getName() + " | " + " | $" + item.getPrice());
        }
    }

    public void dispense() {
        if (soldOut || quantity < 0) {
            System.out.println("SOLD OUT");
            return;
        }
    }
}
