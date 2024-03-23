import java.util.Scanner;

public class ArrayOperations {
private int[] array;

public ArrayOperations(int[] array) {
this.array = array;
}

public void displayArray() {
System.out.println("Array:");
System.out.print("[");
for (int i = 0; i < array.length; i++) {
if (i != 0) {
System.out.print(", ");
}
System.out.print(array[i]);
}
System.out.println("]");
}

public int findSum() {
int sum = 0;
for (int num : array) {
sum += num;
}
return sum;
}

public double findAverage() {
double sum = findSum();
return sum / array.length;
}

public int findMaximum() {
int max = array[0];
for (int i = 1; i < array.length; i++) {
if (array[i] > max) {
max = array[i];
}
}
return max;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();

int[] userArray = new int[size];
for (int i = 0; i < size; i++) {
System.out.print("Element " + (i + 1) + ": ");
userArray[i] = scanner.nextInt();
}

ArrayOperations arrayOps = new ArrayOperations(userArray);

arrayOps.displayArray();

System.out.println("Choose an operation: ");
System.out.println("1. Find Sum");
System.out.println("2. Find Average");
System.out.println("3. Find Maximum");

System.out.print("Enter your choice: ");
int choice = scanner.nextInt();

switch (choice) {
case 1:
System.out.println("Sum of the array: " + arrayOps.findSum());
break;
case 2:
System.out.println("Average of the array: " + arrayOps.findAverage());
break;
case 3:
System.out.println("Maximum element in the array: " + arrayOps.findMaximum());
break;
default:
System.out.println("Invalid choice. Please enter a valid option.");
}

scanner.close();
}
}