public abstract class Omnivore extends Animal {

    public Omnivore(String name, int age) {
        super(name, age);
    }

    // No need to throw an exception as omnivores can eat any food
    @Override
    public void eat(Food food){
        System.out.println(name + " is eating " + food.getName());
    }
    @Override
    public void eat(Food food, int times){
        for(int i=0;i<times;i++){
            eat(food);
        }
    }
}
