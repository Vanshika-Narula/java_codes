package OOPS.Inheritance;

public class singleInher {
    public static void main(String[] args) {
        Dog ani = new Dog();
        ani.breathe();
        ani.walk();
    }
}

class Animal {
    String type;
    int age;

    public void breathe(){
        System.out.println("Animal breathes");
    }
}


class Dog extends Animal {
    public void walk() {
        System.out.println("Dog walks");
    }
}