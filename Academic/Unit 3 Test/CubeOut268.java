import java.util.Scanner;

class NumberIn {
int num;

public void inputNum() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number: ");
num = scanner.nextInt();
}
}

public class CubeOut extends NumberIn {
public void displayCube() {
int cube = num * num * num;
System.out.println("Cube of the entered number is: " + cube);
}

public static void main(String[] args) {
CubeOut cubeOut = new CubeOut();
cubeOut.inputNum();
cubeOut.displayCube();
}
}
