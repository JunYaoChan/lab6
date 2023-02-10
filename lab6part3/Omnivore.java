package lab6part3;

public abstract class Omnivore extends Animal {
    Omnivore(String name, int age) {
        super(name, age);
    }
    void eat(Food food){
        System.out.println(getName()+ " is eating "+food.getFood());
    }
}
