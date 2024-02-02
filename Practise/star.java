public class star {
    public static void main(String[] args) {

            int a = 2;
            int b = 3;
            int c = 4;
            int largest = (a>b) ? (a>c?a:c) : (b>c?b:c);
            System.out.println("The largest number is: " + largest);

        }
    }
