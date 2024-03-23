import java.util.Scanner;

@FunctionalInterface
interface WordConcatenator {
String concatenateWords(String word1, String word2);
}

public class ConcatenateWords {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first word: ");
String word1 = scanner.nextLine();

System.out.print("Enter the second word: ");
String word2 = scanner.nextLine();

WordConcatenator concatenator = (w1, w2) -> w1 + " " + w2;
String concatenatedWord = concatenator.concatenateWords(word1, word2);

System.out.println(concatenatedWord);
}
}