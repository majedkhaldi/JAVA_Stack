public class Phone extends Device {
    public void makeCall(){
        this.battery -= 5;
        System.out.println("making a call");
        System.out.println("battery remaining " + showBattery());
        if(this.battery<10){
            System.out.println("battery critical");
        }
    }
    
    public void playGame(){
        if (this.battery > 10){
        this.battery -= 20;
        System.out.println("playing a game");
        System.out.println("battery remaining " + showBattery());
        if(this.battery<10){
            System.out.println("battery critical");
        }
    }
    else{
        System.out.println("you cannot play games, please charge your phone and try again");}
    }

    public void charging(){
        this.battery += 50;
        System.out.println("charging");
        System.out.println("battery remaining " + showBattery());
        if(this.battery<10){
            System.out.println("battery critical");
        }

    }
}
