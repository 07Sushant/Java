public class parameter_array {

    void fun(int []aa)
    {
        for (int k : aa)
        System.out.println(k);
    }
    public static void main(String[] args) {
     int a[] = {1,2,3,4,5};
     System.out.println(a);
     int b[];
     b=a.clone();
     System.out.println(b);
     b[2]=1000;
     for(int i : a)
     {
        System.out.println(i);
     }   
    }
}
