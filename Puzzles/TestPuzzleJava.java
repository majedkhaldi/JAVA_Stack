import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
		char result = generator.getRandomLetter();
		System.out.println(result);

		String word = generator.generatePassword();
		System.out.println(word);

		String[] array = generator.getNewPasswordSet(10);
		System.out.println(array);
		for (int i = 0 ; i < array.length ; i++){
			System.out.println(array[i]);
		}
		       //..
		// Write your other test cases here.
		//..
	}
}
