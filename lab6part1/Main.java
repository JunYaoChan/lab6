package lab6part1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Seth",22);
        Wolf wolf = new Wolf("Uncle",100);
        wolf.makeNoise();
        Parrot parrot = new Parrot("Donuts",12);
        parrot.makeNoise();
        Meat meat = new Meat("chicken");
        Plant plant = new Plant("rocket");
    }
}
