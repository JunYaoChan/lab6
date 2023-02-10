package lab6part2;

public class Parrot extends Animal {
    Parrot(String name, int age) {
        super(name, age);

    }

    void makeNoise() {
        System.out.println(getName() + "is making noise");


    }
}
