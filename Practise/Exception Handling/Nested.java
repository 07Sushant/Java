class sushant
{
    public static void main(String[] args) {
    try{
        int arr[]={1,2,3,4,5};
        int v = arr[6];
        System.out.println(v);
        String aa=null;
        System.out.println(aa.length());
        String bb="Sushant";
        int i = Integer.parseInt(bb);
    
}
    catch (NumberFormatException m)
    {
        System.out.println(m);
        System.out.println("Wrong Number");
    }
    catch(NullPointerException s)
    {
        System.out.println(s);
        System.out.println("aa contain NULL");
    }
    catch(ArithmeticException e)
    {
        System.out.println("Arthemetic Exception");
    }
}
}