import java.util.Scanner;

public class QuizApplication {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your quiz score:");
try {
int score = Integer.parseInt(scanner.nextLine());
System.out.println("Quiz score: " + score);
} catch (NumberFormatException e) {
System.out.println("Error: Invalid input");
}
}
}