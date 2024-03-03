import java.util.Scanner;

class RectangleIn {
int length;
int width;

public void inputDimensions() {
Scanner scanner = new Scanner(System.in);
System.out.println("length:");
length = scanner.nextInt();
System.out.println("width:");
width = scanner.nextInt();
}
}

class AreaOut extends RectangleIn {
public void calculateArea() {
int area = length * width;
System.out.println("Area: " + area);
}
}

public class Main {
public static void main(String[] args) {
AreaOut areaOut = new AreaOut();
areaOut.inputDimensions();
areaOut.calculateArea();
}
}
