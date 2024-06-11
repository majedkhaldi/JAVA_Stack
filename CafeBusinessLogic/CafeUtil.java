import java.util.ArrayList;

class CafeUtil {
    public int getStreakGoal (int numWeeks) {
        int sum = 0;
        for (int i = 1; i < (numWeeks + 1); i++){
            sum += i;
    }   
    return sum;
    }
    public double getOrderTotal(double[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length; i++){
            sum += prices[i];
    }   
    return sum;
    }

    public void displayMenu(ArrayList<String> menu){
    //    menuItems = new ArrayList<String>();
    //    menuItems.add("drip coffee");
    //    menuItems.add("cappuccino");
    //    menuItems.add("latte");
    //    menuItems.add("mocha");
       for (int i = 0; i < menu.size(); i++){
            System.out.println(String.format("%d %s", i, menu.get(i)));
    }   
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        customers.add(username);
        System.out.println(String.format("Hello %s There are %d people in front of you",username, (customers.size()-1)));
        
    }






    }