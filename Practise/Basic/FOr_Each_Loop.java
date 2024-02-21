public class FOr_Each_Loop {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        for(int i : num)
        {
            if(i%2==0)
            {
                System.out.println("The number: " + i + " is even");
            }else{
                System.out.println("The number: " + i + " is odd");
            }
        }   
    }
}
