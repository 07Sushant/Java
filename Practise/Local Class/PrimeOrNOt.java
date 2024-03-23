import java.util.Scanner;

public class PrimeOrNOt {
    public static void main(String[] args) {
        class A {
            void fun() {
                Scanner sc = new Scanner(System.in); 
                int x = sc.nextInt();
                if (x == 2) {
                    System.out.println("2 is prime");
                } else {
                    boolean isPrime = true;

                    for (int i = 2; i <= Math.sqrt(x); i++) {
                        if (x % i == 0) {
                            isPrime = false;
                            break; 
                        }
                    }
                    if (isPrime) {
                        System.out.println(x+" is prime");
                    } else {
                        System.out.println(x+" is not prime");
                        if(x%2==0)
                        {
                            System.out.println(x+" is Even");
                        }
                        else
                        {
                            System.out.println(x+" is Odd");
                        }
                    }
                }
                sc.close();
            }
        }

        A obj = new A();
        obj.fun(); 
    }
}
