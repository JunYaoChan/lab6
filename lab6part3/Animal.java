package lab6part3;

public abstract class Animal {
    abstract void makeNoise();
    abstract void eat(Food food) throws Exception;
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

