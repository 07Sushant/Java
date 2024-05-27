class A<T>{
    T a;
    void fun(T b){
        a=b;
        System.out.println(a);
    }
}
public class genericclass {
    public static void main(String[] args) {
        A<Integer> obj=new A<Integer>();
        obj.fun(10);

        A<String> obj1=new A<String>();

        obj1.fun("Hello");
    }
}