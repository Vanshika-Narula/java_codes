package OOPS.Inheritance;

public class hierachicalInher {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.breathe();
        fish.swim();

        Dog dog = new Dog();
        dog.breathe();
        dog.walk();


    }
}

class Animal {
    public void breathe() {
        System.out.println("Animal breathes");
    }
}

class Dog extends Animal {
    public void walk() {
        System.out.println("Dog walks");
    }
}

class Fish extends Animal {
    public void swim() {
        System.out.println("Fish swims");
    }
}
