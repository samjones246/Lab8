public class Main {

    public static void main(String[] args) {
        Wolf myWolf = new Wolf("Wolfgang", 6);                              // Wolf instantiated
        System.out.println("(Wolf) Name: "+myWolf.getName()+", Age: "+myWolf.getAge());
        Parrot myParrot = new Parrot("Polly", 43);                          // Parrot instantiated
        System.out.println("(Parrot) Name: "+myParrot.getName()+", Age: "+myParrot.getAge());
        Cow myCow = new Cow("Bessy", 2);                                    // Cow instantiated
        System.out.println("(Cow) Name: "+myCow.getName()+", Age: "+myCow.getAge());
        System.out.println("---Feeding Time---");
        Meat steak = new Meat("Steak");                                          // Meat instantiated
        Plant grass = new Plant("Grass");                                        // Plant instantiated
        try {
            System.out.println("Feeding Wolf steak 3 times...");
            myWolf.eat(steak, 3);
            System.out.println("Feeding Cow grass 4 times...");
            myCow.eat(grass, 4);
            System.out.println("Feeding Parrot steak 2 times...");
            myParrot.eat(steak, 2);
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.println("Creating wolf with default constructor...");
        Wolf newBornWolf = new Wolf();
        System.out.println("Name: " + newBornWolf.getName());
        System.out.println("Age: " + newBornWolf.getAge());
    }
}
