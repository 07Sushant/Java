interface A{
    void prime();
}

class B{
    void prime()
    {
        System.out.println("this is class B");
    }
}

class C extends B implements A{
    public void prime()
    {
        System.out.println("this is class c");
    }

}

public class prime_interface {
    public static void main(String[] args) {
        
         C obj = new C();
         obj.prime();

    }
    
}
