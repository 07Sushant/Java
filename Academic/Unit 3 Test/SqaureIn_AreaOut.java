import java.util.Scanner;

class SquareIn {
protected int side;

public void inputDimensions() {
Scanner scanner = new Scanner(System.in);
side = scanner.nextInt();
}
}

class AreaOut extends SquareIn {
public void calculateArea() {
int area = side * side;
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
