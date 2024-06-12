import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        Item item1 = new Item("mocha",12.5);

        Item item2 = new Item("latte",9.5);

        Item item3 = new Item("drip coffee",11.5);

        Item item4 = new Item("cappuccino",15);


    
        Order order1 = new Order();
        order1.setName("Cindhuri");
        Order order2 = new Order();
        order2.setName("Noah");
        Order order3 = new Order();
        order3.setName("Jimmy");
        Order order4 = new Order();
        order4.setName("Sam");
        Order order5 = new Order();
        Order order6 = new Order();
        Order order7 = new Order("Sammer");
        Order order8 = new Order("Burkan");
        Order order9 = new Order("talahmo");


        order2.addToList(item1, item1.getPrice());
        order2.addToList(item4, item4.getPrice());
        order4.addToList(item2, item2.getPrice());
        for (int i = 0 ; i<2 ; i++){
            order4.addToList(item2, item2.getPrice());
        }
        order1.setReady();
        order3.setReady();
        System.out.println(order1.getStatusMessage());
        // Application Simulations
        
        // Use this example code to test various orders' updates
        // System.out.printf("Total: %s\n", order1.getTotal());
        // System.out.printf("Ready: %s\n", order1.isReady());
        // System.out.println(order1);
        // System.out.println(order1.getTotal());        
        // System.out.println(order2.getItems() + "total is:" + order2.getTotal());
        // System.out.println(order4.getItems() + "total is:" + order4.getTotal());
        
        // System.out.println(order1.isReady());
        order4.display();



    }
}
