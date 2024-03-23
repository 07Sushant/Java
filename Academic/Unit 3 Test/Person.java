// package q22005;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user input for name and age
        System.out.println("Enter the name:");
        String nameInput = scanner.nextLine();
        System.out.println("Enter the age:");
        int ageInput = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Create parameterized Person object with user input
        Person userInputPerson = new Person(nameInput, ageInput);

        // Create default Person object
        Person defaultPerson = new Person();

        // Output default Person details
        System.out.println("Default Person: Name - " + defaultPerson.getName() + ", Age - " + defaultPerson.getAge());

        // Output user input Person details
        System.out.println("User Input Person: Name - " + userInputPerson.getName() + ", Age - " + userInputPerson.getAge());

        scanner.close();
    }
}
