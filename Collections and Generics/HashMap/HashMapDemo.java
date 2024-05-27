// package HashMap;
// import java.util.HashMap;
// import java.util.Map;

// public class HashMap {
//     public static void main(String[] args) {
//         HashMap<String, Integer>map=new HashMap();
//         map.put("Sushant",10);
//         map.put("Siddhi",20);
//         map.put("Namit",30);

//         for(Map.Entry<String,Integer>e:map.entrySet())
//         System.out.println("Key: "+e.getKey()+"Value: "+e.getValue());
//     }
// }

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            map.put(name, value);
        }
        
        if (map.containsKey("Sushant")) {
            System.out.println("Sushant exists in the map.");
        } else {
            System.out.println("Sushant does not exist in the map.");
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

