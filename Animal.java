public abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    // Abstract methods implemented in subclasses
    public abstract void makeNoise();
    public abstract void eat(Food food) throws Exception;
    public abstract void eat(Food food, int times) throws Exception;
}
