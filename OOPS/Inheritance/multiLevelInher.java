package OOPS.Inheritance;

public class multiLevelInher {
    public static void main(String[] args) {
        Human me = new Human();
        me.breathe();
        me.walk();
        me.speak();
    
    }
}


class Animal {
    public void breathe() {
        System.out.println("Animal Breathes");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Mammals walks");
    }
}

class Human extends Mammal {
    public void speak() {
        System.out.println("Human speaks language");
    }
}
