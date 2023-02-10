package lab6part3;

public class Parrot extends Omnivore {
    Parrot(String name, int age) {
        super(name, age);

    }

    void makeNoise() {
        System.out.println(getName() + "is making noise");

    }

}
