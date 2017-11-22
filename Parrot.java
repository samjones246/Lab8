public class Parrot extends Omnivore{

    public Parrot(String name, int age) {
        super(name, age);
    }

    // Implementation of Animal.makeNoise
    @Override
    public void makeNoise(){
        System.out.println(this.name + " says: Squawk!");
    }
}
