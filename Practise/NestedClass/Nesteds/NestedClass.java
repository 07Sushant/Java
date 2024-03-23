class A{
    void fun(){

    }

    class B{
        void fun1()
        {
            System.out.println("Class A");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {

        A obj = new A();
        A.B obj1=obj.new B();
        obj1.fun1();
    }
    
}
