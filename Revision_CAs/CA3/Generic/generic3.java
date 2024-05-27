interface A<T>
{
   T fun(T a);
}

public class generic3 implements A<Integer>{
    public Integer fun(Integer a)
    {
        System.out.println(a);
        return a;
    }
}
public static void main(String[] args)
{
        generic3 obj = new generic3();
        obj.fun(10);
}
