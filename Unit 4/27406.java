package q27406;

import java.util.Scanner;

interface Greeting {
void sayHello(String name);
}

public class Greeter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();

Greeting greeter = new Greeting() {
@Override
public void sayHello(String name) {
System.out.println("Hello, " + name + "!");
}
};

// Greeting the person by their name
greeter.sayHello(name);

scanner.close();
}
}