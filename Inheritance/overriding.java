public class overriding {
    public static void main(String[] args) {
        
    
    Deer d = new Deer();
    d.eat();
}

}
class Animal{
    void eat()
    {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal{
    void eat()
    {
        System.out.println("Eat grass");
    }
}
