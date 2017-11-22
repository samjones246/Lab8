import java.util.ArrayList;
import java.util.Collections;

/*
 * An interface is a concept in java similar to a class, but it can cannot implement any methods, just define their signatures.
 *
*/
public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Wolf("WolfA", 9));
        animals.add(new Parrot("ParrotA",7));
        animals.add(new Cow("CowA", 12));
        animals.add(new Wolf("WolfB", 5));
        animals.add(new Parrot("ParrotB",20));
        animals.add(new Cow("CowB", 3));
        animals.add(new Wolf("WolfC", 1));
        animals.add(new Parrot("ParrotC",4));
        animals.add(new Cow("CowC", 14));
        for(Animal animal: animals){
            System.out.println(animal.name + ", " + animal.age);
        }
        System.out.println("----------------");
        //Passing Collections.reverseOrder as the second parameter of Collections.sort will result in the Animals being
        //sorted in descending age order.
        Collections.sort(animals, Collections.reverseOrder());
        for(Animal animal: animals){
            System.out.println(animal.name + ", " + animal.age);
        }
    }
}
