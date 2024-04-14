import java.util.Scanner;

public class CubeRootCalculator {
private int number;

public CubeRootCalculator(int number) {
this.number = number;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
CubeRootCalculator cubeRootCalculator = new CubeRootCalculator(number);
CubeRootFinder cubeRootFinder = cubeRootCalculator.new CubeRootFinder();
double cubeRoot = cubeRootFinder.findCubeRoot();
System.out.printf("%.2f", cubeRoot);
scanner.close();
}

class CubeRootFinder {
public double findCubeRoot() {
return Math.cbrt(number);
}
}
}