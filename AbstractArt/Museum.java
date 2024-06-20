// inside of Museum.java

import java.util.ArrayList;
import java.util.Random;

public class Museum {
    public static void main(String[] args) {
        Painting p1 = new Painting();
        p1.setTitle("MonaLisa");
        p1.setAuthor("Da Vinci");
        p1.setDescription("in the Louvre");
        p1.setType("oil");
        Painting p2 = new Painting();
        p2.setTitle("LandScape");
        p2.setAuthor("Mone");
        p2.setDescription("impressionist");
        p2.setType("oil");
        Painting p3 = new Painting();
        p3.setTitle("Guernica");
        p3.setAuthor("Picasso");
        p3.setDescription("in MOMA");
        p3.setType("water");

        Sculpture s1 = new Sculpture();
        s1.setTitle("King David");
        s1.setAuthor("Micheal Angelo");
        s1.setDescription("in Vatican City");
        s1.setMaterial("stone");

        Sculpture s2 = new Sculpture();
        s2.setTitle("baloon swan");
        s2.setAuthor("Jeff Koons");
        s2.setDescription("yellow contemporary");
        s2.setMaterial("baloons");

        ArrayList<Art> museum = new ArrayList<Art> ();
        museum.add(p1);
        museum.add(p2);
        museum.add(p3);
        museum.add(s1);
        museum.add(s2);

        Random randMachine = new Random();
        int rand = randMachine.nextInt(museum.size());
        System.out.println(museum.get(rand).getTitle() +"\n"+ museum.get(rand).getAuthor() +"\n"+ museum.get(rand).getDescription() );
    }
}
