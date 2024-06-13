import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    public void addMenuItem(String name, double price){
        Item aitem = new Item(name,price);
        this.menu.add(aitem);
        aitem.setIndex(this.menu.indexOf(aitem));
    }
    public void displayMenu(){
        for (int i = 0 ; i < this.menu.size() ; i++){
            System.out.println(this.menu.get(i).getIndex() + " " + this.menu.get(i).getName() + " -- $" + this.menu.get(i).getPrice());
        }
    }

    public ArrayList<String> getmenu(){
        ArrayList<String> itemnames = new ArrayList<String>();
        for (int i = 0 ; i < this.menu.size() ; i++){
            itemnames.add(this.menu.get(i).getName());
        }
        return itemnames;
     }

    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order norder = new Order(name);
    
        displayMenu();
    
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
    
        while(!itemNumber.equals("q")) {
            try {
                Item addeditem = this.menu.get(Integer.parseInt(itemNumber));
                norder.addToList(addeditem);
            } catch (Exception e) {
                System.out.println("Please enter a valid index");
                displayMenu();
            }
    
            System.out.println("Please enter another menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
    
        System.out.println("Your order:");
        norder.display();
        this.orders.add(norder);
    }
    

    public void addMenuItemByInput(){
        System.out.println("Please enter the new item's name");
        String name = System.console().readLine();
        System.out.println("Please enter the new item's price");
        String price = System.console().readLine();
        Item nitem = new Item(name, Double.parseDouble(price));
        this.menu.add(nitem);
        nitem.setIndex(this.menu.indexOf(nitem));

    }


    //  public void newOrder() {
        
    //     System.out.println("Please enter customer name for new order:");
    //     String name = System.console().readLine();
    //     Order norder = new Order(name);
    //     if (norder.isReady() == false) {
    //         displayMenu();
    //     }

    //     System.out.println("Please enter a menu item index or q to quit:");
    //     String itemNumber = System.console().readLine();
    //     // try {
    //     //     Item addeditem = this.menu.get(Integer.parseInt(itemNumber));
    //     //     norder.addToList(addeditem);
    //     // } catch (Exception e) {
    //     //     System.out.println("please enter a valid index");
    //     //     displayMenu();
    //     //     System.out.println("Please enter a menu item index or q to quit:");
    //     //     itemNumber = System.console().readLine();
    //     // }
        
    //     while(!itemNumber.equals("q")) {
            

    //         try {
    //             Item addeditem = this.menu.get(Integer.parseInt(itemNumber));
    //             norder.addToList(addeditem);
    //         System.out.println("Please enter another menu item index or q to quit:");
    //         String otherItemNumber = System.console().readLine();
    //         addeditem = this.menu.get(Integer.parseInt(otherItemNumber));}
    //         // try {
    //         //     Item addeditem = this.menu.get(Integer.parseInt(otherItemNumber));
    //         //     norder.addToList(addeditem);}
    //         catch (Exception e) {
    //             System.out.println("please enter a valid index");
    //         }
    //     }
    //     System.out.println("your order:");
    //     norder.display();
        
    // }
}
