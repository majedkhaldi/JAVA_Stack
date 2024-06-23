public class Bat extends Mammal {

    // Constructor to initialize energy
    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        this.energy -= 50;
        System.out.println("The bat has flown, energy level dropped to " + displayEnergy());
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("The bat has eaten some humans, energy level rose to " + displayEnergy());
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("The bat has attacked a town, energy level dropped to " + displayEnergy());
    }
}

