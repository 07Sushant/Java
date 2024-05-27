class finally_ {
    int fun()
    {
        System.out.println("Hello world");
        int a=10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
            return c;
        }
        catch(ArithmeticException e)
        {
            System.out.println("catch Reuns");
        }
        finally{
            System.out.println("Class");
            System.out.println("Bye Bye");
        }
        return 0;
    }

    public static void main(String[] args) {
        finally_ objFinally_ = new
    }
}
