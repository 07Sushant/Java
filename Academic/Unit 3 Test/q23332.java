package q23332;

import java.util.Scanner;

class Temperature {
protected float celsius;
protected float fahrenheit;

public void inputTemperature() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter temperature in Celsius: ");
celsius = scanner.nextFloat();
}
}

class Conversion extends Temperature {

public void convertToFahrenheit() {
fahrenheit = (celsius * 9 / 5) + 32;
System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
}
}

public class Main {
public static void main(String[] args) {
Conversion conversion = new Conversion();
conversion.inputTemperature();
conversion.convertToFahrenheit();
}
}
