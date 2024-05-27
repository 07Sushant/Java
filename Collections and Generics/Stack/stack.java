import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Pushing elements onto the stack:");
        stack.push(23);
        stack.push(12);
        stack.push(24);
        stack.push(29);
        stack.push(26);

        System.out.println("Top element of the stack: " + stack.peek());
        System.out.println("Popping element from the stack:");
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Stack after popping: " + stack);
    }

