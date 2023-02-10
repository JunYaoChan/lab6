package lab6part3;

public abstract class Herbivore extends Animal {
    Herbivore(String name, int age) {
        super(name, age);
    }

    void eat(Food food) throws Exception{
        if (food instanceof Meat){
            throw new Exception("An Error Message");

        }
        System.out.println(getName() + " is eating " + food.getFood());
    }
}
