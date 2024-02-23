//multiple ineritence

interface A{
    int rl=23032;
    void fun();
}
interface B{
    String c="Hello";
    void show();
}
class C implements A,B{
    public void fun(){
        System.out.println("C inherit A");
    }
    public void show(){
        System.out.println("C inherits B");
    }
}

class D extends C{
    D(){
        System.out.println("This is hybrid inheritance");
    }
}
class E extends C{
    E(){
        System.out.println("This is hybrid inheritance 2");
    }
}


public class hybrid {
    public static void main(String[] args) {
        E objE = new E(); 
        D objD = new D();
        objE.fun();
        objE.show();
    }
}
