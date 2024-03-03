import java.util.Scanner;

class NumberIn {
protected int num;

public void inputNum() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number: ");
num = scanner.nextInt();
}
}

class CubeOut extends NumberIn {
public void displayCube() {
System.out.println((num * num * num));
}
}

public class test924 {
public static void main(String[] args) {
CubeOut cubeOut = new CubeOut();
cubeOut.inputNum();
cubeOut.displayCube();
}
}
