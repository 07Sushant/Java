package q26235;

import java.util.Scanner;
import java.util.Arrays;

interface AverageCalculator {
double calculateAverage(int[] numbers);
}

public class AverageLambda {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the array of integers separated by spaces:");
String[] input = scanner.nextLine().split(" ");
int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

AverageCalculator calculator = (int[] arr) -> {
if (arr.length == 0) return 0;
double sum = 0;
for (int num : arr) {
sum += num;
}
return sum / arr.length;
};

double average = calculator.calculateAverage(numbers);
System.out.println("Average: " + average);

scanner.close();
}
}