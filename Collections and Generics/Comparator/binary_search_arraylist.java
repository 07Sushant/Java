import java.io.*;
import java.lang.*;
import java.util.*;

class Student {
    int rollno;
    String name, address;
    
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class Sortbyaddress implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getAddress().compareTo(b.getAddress());
    }
}

public class binary_search_arraylist {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Namit", "BTC"));
        ar.add(new Student(131, "Sushant", "Paris"));
        ar.add(new Student(121, "Saful", "New York"));

        Collections.sort(ar, new Sortbyaddress());
        System.out.println("\nSorted by address:");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        
        String searchAddress = "Paris";
        int index = binarySearch(ar, searchAddress);
        if (index != -1) {
            System.out.println("\nStudent found at index " + index + ": " + ar.get(index));
        } else {
            System.out.println("\nStudent with address " + searchAddress + " not found.");
        }
    }

    public static int binarySearch(ArrayList<Student> ar, String searchAddress) {
        int left = 0, right = ar.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = ar.get(mid).getAddress().compareTo(searchAddress);
            
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
