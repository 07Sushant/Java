class A<T extends Number>{
    T a;
    public void fun(T b){
        a=b;
        System.out.println(a.doubleValue() + a.doubleValue());
    }
}
public class BoundedClass {
    public static void main(String[] args) {
        A<Integer> obj = new A<>();
        obj.fun(12);
    }
}
