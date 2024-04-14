public class Animalss {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }

}
//base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}
// derived
class Fish extends Animal {
    int fins;
    void swin() {
        System.out.println("Swiming");
    }
}