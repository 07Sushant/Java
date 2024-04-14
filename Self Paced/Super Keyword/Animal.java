public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}


class Animals {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animals {
    void eat() {
        super.eat(); // Calling superclass method
        System.out.println("Dog is eating");
    }
}


