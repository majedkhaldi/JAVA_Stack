import java.util.Random;
import java.util.ArrayList;
    
class PuzzleJava {

    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(randMachine.nextInt(20) + 1); // Random number between 1 and 20
        }
        return arr;
}

    public char getRandomLetter(){
        char letter;
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int ind = randMachine.nextInt(25);
        letter = alphabet[ind];
        return letter;
    }

    public String generatePassword(){
        String word = "";
        for (int i = 0 ; i<8 ; i++){
            word += getRandomLetter();
        }
        return word;
    }

    public String[] getNewPasswordSet(int len){
        String[] arr = new String[len];
        for (int i = 0 ; i < len ; i++){
            arr[i] = generatePassword();
        }
        return arr;
    }


}