public class Var_args {

    void fun(int...a)
    {
        System.out.println("-----------------------------------");
        for(int i:a)
        {
                if(i%2==0){
            System.out.println("Even: "+ i);}else{
                System.out.println("Odd: "+ i);
            }
        }
    }
    // void funn(int a, float b)

    public static void main(String[] args) {
        Var_args sc =new Var_args();
        sc.fun(0,1,2,3,4,5);        
    }
}


