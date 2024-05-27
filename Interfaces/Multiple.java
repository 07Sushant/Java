public class Multiple {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }    
}

interface flyable
{
    void fly();
}

interface Swimmable{
    void swim();
}


class Bird implements flyable, Swimmable{
    public void fly()
    {
        System.out.println("Flying");
    }

    public void swim()
    {
        System.out.println("Swiming");
    }
}