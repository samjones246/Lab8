public abstract class Carnivore extends Animal {

    public Carnivore(String name, int age) {
        super(name, age);
    }

    // Throws an exception if the food passed into this method is a Plant
    @Override
    public void eat (Food food) throws Exception{
        if(food instanceof Plant) {
            throw new Exception("Carnivores cannot eat plants!");
        }else{
            System.out.println(name + " is eating " + food.getName());
        }
    }
    @Override
    public void eat(Food food, int times) throws Exception{
        for(int i=0;i<times;i++){
            eat(food);
        }
    }
}
