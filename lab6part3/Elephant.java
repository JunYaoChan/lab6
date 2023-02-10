package lab6part3;

public class Elephant extends Herbivore{
    Elephant(String name, int age) {
        super(name, age);
    }

    void makeNoise() {
        System.out.println(getName() + "is making noise");

    }


}


