package q29133;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizScorer {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int numQuestions = scanner.nextInt();
scanner.nextLine();
Map<Integer, Integer> correctAnswers = new HashMap<>();

for(int i = 1;i <= numQuestions; i++)
{
System.out.print("Correct answer for Question " + i + ": ");
int correctAnswer = scanner.nextInt();
correctAnswers.put(i, correctAnswer);
}
int score = 0;
for(int i = 1; i <= numQuestions; i++)
{
System.out.print("Student answer for Question " + i + ": ");
int studentAnswer = scanner.nextInt();
if(correctAnswers.containsKey(i) && correctAnswers.get(i) == studentAnswer)
{
score++;
}
}
System.out.println(score + " out of " + numQuestions);
scanner.close();

}
}


