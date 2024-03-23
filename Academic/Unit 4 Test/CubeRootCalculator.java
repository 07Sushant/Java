import java.util.Scanner;

public class CubeRootCalculator {
private int number;

public CubeRootCalculator(int number) {
this.number = number;
}

public class CubeRootFinder {
public double findCubeRoot() {
if (number < 0) {
return -Math.pow(-number, 1.0 / 3.0);
} else {
return Math.pow(number, 1.0 / 3.0);
}
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
CubeRootCalculator cubeRootCalculator = new CubeRootCalculator(number);
CubeRootCalculator.CubeRootFinder cubeRootFinder = cubeRootCalculator.new CubeRootFinder();
double cubeRoot = cubeRootFinder.findCubeRoot();
System.out.printf("%.2f\n", cubeRoot);
scanner.close();
}
}