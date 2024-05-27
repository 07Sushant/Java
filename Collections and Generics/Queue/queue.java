public class queue {
    
}import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        
        System.out.println("Queue: " + queue);
        
        int removedElement = queue.poll(); 
        System.out.println("Removed element: " + removedElement);
        
        System.out.println("Updated Queue: " + queue);
        
        int frontElement = queue.peek(); // Returns the element at the front of the queue without removing it
        System.out.println("Element at the front: " + frontElement);
                System.out.println("Queue after peek: " + queue);
    }
}
