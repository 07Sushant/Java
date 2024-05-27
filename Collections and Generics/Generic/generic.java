class A<T,U>
{
    T a;
    U b;
    void fun(T a, U b)
    {
        System.out.println(a + ", " + b);
    }
    

}

public class generic {
    public static void main(String[] args) {
        A<Integer,String> obj = new A<Integer,String>();
        A<Integer,String> obj1 = new A<Integer,String>();
        obj.fun(20, "Sushant");
        obj1.fun(30,"Sushant");

    }
}




// class A<T,U>
// {
//     T a;
//     U b;
//     void fun(T a, U b)
//     {
//         System.out.println(a + ", " + b);
//     }
// }

// public class generic {
//     public static void main(String[] args) {
//         A<Integer,String> obj = new A<Integer,String>();
//         A<Integer,String> obj1 = new A<Integer,String>();
//         obj.fun(20, "Sushant");
//         obj1.fun(30, "Sushant");
//     }
// }
