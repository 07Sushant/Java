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


public class multiple_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.fun();
        obj.show();
        
    }
}