public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 10.3;
        double lattePrice = 12.5;
        double cappuccinoPrice = 8.5;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	System.out.println(customer1 + (isReadyOrder1? readyMessage : pendingMessage));
        if (isReadyOrder4) {
    	System.out.println(customer4 + readyMessage + " " + displayTotalMessage + cappuccinoPrice);
        }
        else {
        System.out.println(customer4 + pendingMessage);
        }
        System.out.println(customer2 + " " + displayTotalMessage + (2*lattePrice)+ (isReadyOrder2? readyMessage : pendingMessage));
        System.out.println(customer3 + " " + displayTotalMessage + (dripCoffeePrice-lattePrice));
}
}
