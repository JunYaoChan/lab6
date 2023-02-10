package lab6part3;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal;
        Wolf wolf = new Wolf("Ali",100);
        Meat meat = new Meat("chicken");
        Plant plant = new Plant("cabbage");
        wolf.makeNoise();
        wolf.eat(meat);
        Parrot parrot = new Parrot("Donuts",12);
        parrot.makeNoise();
        parrot.eat(meat);
        Elephant elephant = new Elephant("Big Man",252);
        elephant.makeNoise();
        elephant.eat(plant);
        parrot.eat(plant);

        try {
            elephant.eat(meat);
            wolf.eat(plant);

        }catch(Exception e){
            System.out.println("Error");

        }


    }
}
