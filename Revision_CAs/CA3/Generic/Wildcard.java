import java.util.*;

class Animal{
    void get ()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal{
    void eat()
    {
        System.out.println("Cat is eating");
    }
}

class Rat extends Animal{
    void eat(){
        System.out.println("Rat is eating");
    }
}

public class Wildcard {
    public static void feed(List<? extends Animal>List) {
        for(Animal i:list)
        {
            i.eat();
        }
    }

    public static void main(String[] args) {
        List<Animal>list11=new ArrayList<>();
        list1.add(new Animal());
        list1.add(new Animal());

        List<Dog>list12=new ArrayList<>();
        list2.add(new Dog());
        list2.add(new Dog());

        List

    }


}