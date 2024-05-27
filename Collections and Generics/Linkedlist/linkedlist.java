import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        System.out.println("Enter the ");
        obj.add(23);
        obj.add(12);
        obj.add(24);
        obj.add(29);
        obj.add(26);
        int a = obj.size()/2;
        
        System.out.println(obj.get(a));
        obj.remove(a);
        System.out.println(obj);
    }
}