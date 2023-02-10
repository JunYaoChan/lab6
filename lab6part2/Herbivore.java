package lab6part2;



public abstract class Herbivore extends Animal {
    Herbivore(String name, int age) {
        super(name, age);
    }

    void eat(Food food)  {
        System.out.println(getName() + " is eating " + food.getFood());
    }
}
