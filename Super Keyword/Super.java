
public class Super {
    public static void main(String[] args) {
        horse h = new horse();
        
    }
}

class Animal{
    Animal()
    {
        System.out.println("COnstructor");
    }
}

class horse extends Animal{
    horse(){
        super();
        System.out.println("Horse constr");
    }
}
