public class largest {
    int num1;
    int num2;
    int num3;
    public largest(int a, int b, int c)
    {
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c)
        {
            System.out.println(b);
        }else{
            System.out.println(c);
        } 
    }


    public static void main(String[] args) {
        largest a = new largest(10, 20, 30);
        
    }
    
}

