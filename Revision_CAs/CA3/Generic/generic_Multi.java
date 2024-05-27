class A<T, M, U, Y> {
    T a;
    M S;
    U c;
    Y d;

    void fun(T b, M q, U c, Y d) {
        a = b;
        S = q;
        this.c = c;
        this.d = d;

        System.out.println(a);
    }
}

public class generic_Multi {
    public static void main(String[] args) {
        A<Integer, String, Double, Character> obj = new A<>();
        obj.fun(10, "String", 3.14, 'C');

        A<String, Integer, Double, Character> obj1 = new A<>();
        obj1.fun("Hello", 42, 2.71, 'X');
    }
}
