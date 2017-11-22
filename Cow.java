public class Cow extends Herbivore {

    public Cow(String name, int age) {
        super(name, age);
    }

    // Implementation of Animal.makeNoise
    @Override
    public void makeNoise() {
        System.out.println(name + " says: Moo!");
    }
}
