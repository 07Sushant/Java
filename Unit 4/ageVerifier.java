import java.util.Scanner;

public class Person {
private String name;
private int age;

public Person(String name, int age) {
this.name = name;
this.age = age;
}

class AgeVerifier {
public boolean isAdult() {
return age >= 18;
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int age = scanner.nextInt();
Person person = new Person(name, age);
Person.AgeVerifier ageVerifier = person.new AgeVerifier();
boolean isAdult = ageVerifier.isAdult();
System.out.println(name + " is an adult: " + isAdult);
scanner.close();
}
}



