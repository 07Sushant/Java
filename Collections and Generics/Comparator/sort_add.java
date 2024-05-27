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
public class sort_add {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Namit", "BTC"));
        ar.add(new Student(131, "Sushant", "Paris"));
        ar.add(new Student(121, "Saful", "New York"));

        Collections.sort(ar, new Sortbyaddress());
        System.out.println("\nSorted by address:");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}