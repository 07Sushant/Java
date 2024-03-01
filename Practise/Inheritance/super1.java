
class A{
    int a = 100;
    int b = 200;
    void Super_fun()
    {
        System.out.println("Calling from super key");
    }
}

class B extends A{
    
    int a = 150;
    int b = 156;

    void fun(){
    if((super.a==a) && (super.b==b))
    
    {   
        System.out.println("Equal");
        super.Super_fun();
    }else{
        System.out.println("Not");
    }
        
}
}

public class super1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.fun();
        obj.Super_fun();
        
    }

    
}
