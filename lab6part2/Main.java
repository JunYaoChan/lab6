package lab6part2;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        Wolf wolf = new Wolf("Ali",100);
        wolf.makeNoise();
        Parrot parrot = new Parrot("Donuts",12);
        parrot.makeNoise();
        Meat meat = new Meat("chicken");
        Plant plant = new Plant("rocket");
    }
}
