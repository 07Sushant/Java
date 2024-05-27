class Animal {
    Animal() {
        System.out.println("This is class Animal and has four legs");
    }
}

class Bull extends Animal {
    void fun() {
        System.out.println("This is class Bull");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("This is class Cat");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Call the constructor of the superclass Animal
        System.out.println("This is class Dog and has four legs");
    }

    void fun() {
        System.out.println("This is class Dog");
    }
}


public class Animals {
    public static void main(String[] args) {
        Dog obj = new Dog();
        Cat obj2 = new Cat();
        Bull obj1 = new Bull();

        obj.fun(); // Calling the fun() method of class Bull
    }
}
