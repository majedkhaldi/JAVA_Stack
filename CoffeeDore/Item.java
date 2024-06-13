public class Item{
    private String name;
    private double price;
    // private int itemindex;
    private int index;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
        // this.itemindex = index;
        // index++;
    }

    // public Item(){
    //     this.itemindex = index;
    //     index++;
    // }

    public void setName(String name){
        this.name =name;
    }
    public void setPrice(double price){
        this.price =price;
    }
    public double getPrice(){
        return this.price;
    }
    
    public String getName(){
        return this.name;
        }
        
    public int getIndex(){
        return this.index;
    }
    public void setIndex(int i){
        this.index = i;
    }
    
}