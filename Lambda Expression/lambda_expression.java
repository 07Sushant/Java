@FunctionalInterface   
interface KK22GB{
    void fun();
}

public class lambda_expression {
    public static void main(String[] args) {
        KK22GB obj =() ->System.out.println("HelloWorld");
        obj.fun();
        
    }
    
}
