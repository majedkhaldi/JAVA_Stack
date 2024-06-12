import java.util.ArrayList;


public class Order{
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.total = 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.total = 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addToList(Item item, double price){
        this.items.add(item);
        this.total += price;
    }
     public ArrayList<String> getItems(){
        ArrayList<String> itemnames = new ArrayList<String>();
        for (int i = 0 ; i < this.items.size() ; i++){
            itemnames.add(this.items.get(i).getName());
        }
        return itemnames;
     }
     public double getTotal(){
        return this.total;
     }

     public void setReady() {
        this.ready = true;
    }
    public boolean isReady() {
        return this.ready;
      }
    public String getStatusMessage(){
        if (isReady() == true){
            return "Your order is ready";
        }
        else{
            return  "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public void display(){
        System.out.println (String.format("Customer Name: %s",this.name));
        for (int i = 0 ; i < this.items.size() ; i++){
            System.out.println(items.get(i).getName() + " - " + items.get(i).getPrice());
        }
        System.out.println("Your Total is " + this.total);
    }


}