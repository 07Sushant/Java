class A{
    void fun(){

    }

    class B{
        void fun1()
        {
            System.out.println("Class A");
            class Sushant{}
            class Kumar {
                void kumarfun()
                {
                    System.out.println("B Local kumar");
                }
            }
        }
    }
}

public class LocalClass {
    public static void main(String[] args) {

        A obj = new A();
        A.B obj1=obj.new B();
        obj1.fun1();
    }
    
}
