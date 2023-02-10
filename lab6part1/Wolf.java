package lab6part1;

public class Wolf extends Animal {
    Wolf(String name, int age) {
        super(name, age);

    }

    void makeNoise() {
        System.out.println(getName() + " is making noise");


    }
}