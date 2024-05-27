package q11277;

class Animal {
void whoAmI() {
System.out.println("I am a generic animal");
}
}

class Dog extends Animal {
void whoAmI() {
System.out.println("I am a dog");
}
}

class Cow extends Animal {
void whoAmI() {
System.out.println("I am a cow");
}
}

class Snake extends Animal {
void whoAmI() {
System.out.println("I am a snake");
}
}

public class RuntimePolymorphismDemo {
public static void main(String[] args) {
Animal ref1 = new Animal();
Animal ref2 = new Dog();
Animal ref3 = new Cow();
Animal ref4 = new Snake();

ref1.whoAmI();
ref2.whoAmI();
ref3.whoAmI();
ref4.whoAmI();
}
}
