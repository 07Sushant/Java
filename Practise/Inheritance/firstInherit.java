class A {
    A() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void fun(){
        System.out.println("This is class B");
    }
}

class C extends B {
    C(){
        System.out.println("This is class C");
    }
}

public class firstInherit {
    public static void main(String[] args) {
        C obj = new C();
        obj.fun(); // Calling the fun() method of class B
    }
}
