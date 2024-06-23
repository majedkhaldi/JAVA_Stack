
public class Gorilla extends Mammal {

	public void throwSomething() {
		this.energy -= 5;
		System.out.print("the gorilla has thrown smthn, energy level dropped to " + displayEnergy() + "\n");
	}
	
	public void eatBananas() {
		this.energy += 10;
		System.out.print("the gorilla is now satisfied thank you for feeding her, the energy levels have risen to " + displayEnergy()+ "\n");
	}
	
	public void climb() {
		this.energy -= 10;
		System.out.print("the gorilla has climbed a tree, how surprising!! energy level dropped to " + displayEnergy()+ "\n");
	}
}
