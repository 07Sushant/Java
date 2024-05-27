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
    
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

public class short_roll {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Namit", "BTC"));
        ar.add(new Student(131, "Sushant", "Paris"));
        ar.add(new Student(121, "Saful", "New York"));

        Collections.sort(ar, new Sortbyroll());
        System.out.println("\nSorted by roll:");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name:");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}