public class Cat extends VendingItem{

    private String type;


    // getters and setters
    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    // constructors
    public Cat (String name, double price, String slotId, String type){
        super(name, price, slotId);
        this.type = type;
    }
}
