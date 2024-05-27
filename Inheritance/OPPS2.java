
public class OPPS2 {
    public static void main(String[] args) {
        Student s1 = new Student("Susahnt");
        // System.out.println(s1.name);
        Student s3 = new Student(123);
        
    }
}

class Student{
    String name;
    int roll;

    // Student()
    // {
    //     System.out.println("Contructor is called");
    // // this.name = name;

    // }
    Student(String name)
    {
        this.name = name;
    }

    Student(int roll)
    {
        this.roll = roll;
    }
}
