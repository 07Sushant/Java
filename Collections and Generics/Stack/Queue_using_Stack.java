import java.util.Scanner;
import java.util.Stack;
public class Queue_using_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for (;;) {
            System.out.println("Press 1 for Push\n Press 2 for pop\n Press 3 for Exit");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    while (!s1.empty()) {
                        s2.push(s1.pop());
                    }
                    s1.add(sc.nextInt());
                    while (!s2.empty()) {
                        s1.push(s2.pop());
                    }
                    System.out.println("Data in Stack is " + s1);
                    System.out.println("Top= " + s1.peek());

                    break;
                case 2:
                    s1.pop();
                    System.out.println(s1);
                    break;

                default:

                    break;
            }
        }

    }

}

