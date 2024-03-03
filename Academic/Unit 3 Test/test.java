// File Name: q23042/MainEmployee.java
package q23042;

import java.util.Scanner;

class Employee {
String name;

String input(String str) {
Scanner scr = new Scanner(System.in);
System.out.print(str);
String result = scr.nextLine();
return result;
}

void inputName() {
name = input("Enter name: ");
}

void displayName() {
System.out.println("Name: " + name);
}
}

class EmployeeInfo extends Employee {
int age;

void inputAge() {
age = Integer.parseInt(this.input("Enter age: "));
}

void displayAge() {
System.out.println("Age: " + age);
}
}

public class MainEmployee {
public static void main(String[] args) {
EmployeeInfo employeeInfo = new EmployeeInfo();
employeeInfo.inputName();
employeeInfo.displayName();
employeeInfo.inputAge();
employeeInfo.displayAge();
}
}
