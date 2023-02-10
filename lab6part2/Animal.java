package lab6part2;

public abstract class Animal {
    abstract void makeNoise();
    private String name;
    private int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;


    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}

