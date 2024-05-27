public class IndexOutOfBound {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int value = numbers[10]; 
            System.out.println("Value at index 10: " + value);}

            catch(Exception e)
            {
                System.out.println("Error agya bhaiii");
            }
        }
}
