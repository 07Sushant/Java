public class Function_overloading {
    void fun(float a)
    {
        System.out.println("Enter the radius: ");
        System.out.println("Volume: " + (4/3)*(22/7)*(a)*(a)*(a));
    }
    public static void main(String[] args) {

        Function_overloading sc =new Function_overloading();
        sc.fun(2);

    }
}


