package lab6part3;

public class Wolf extends Carnivore {
    Wolf(String name, int age) {
        super(name, age);

    }

    void makeNoise() {
        System.out.println(getName() + " is making noise");


    }


}