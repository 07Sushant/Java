
public class exception {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 10, b=0,c;
        try{
            c=a/b;
        }
       
        catch(Exception e)
        {
            System.out.println("Error handling");
        }
        System.out.println(b);
        System.out.println("Bye Class");

        }
    
}
