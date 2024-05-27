class thrrow {
    int fun() throws ArithmeticException{
        int a=10,b=0,c;
        c=a/b;
        return c;
    }
    public static void main(String[] args) {
        thrrow t = new thrrow();
        try {
            t.fun() ;  // calling the method which is throwing exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
            System.err.println(e);
    }
}
}