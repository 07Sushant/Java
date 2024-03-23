import java.util.Scanner;

@FunctionalInterface
interface PalindromeChecker {
boolean isPalindrome(String word);
}

public class PalindromeCheck {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a word: ");
String word = scanner.nextLine();

PalindromeChecker checker = w -> {
String lowercaseWord = w.toLowerCase(); // Convert word to lowercase
StringBuilder reversedWord = new StringBuilder(lowercaseWord).reverse();
return lowercaseWord.equals(reversedWord.toString());
};

boolean isPalindrome = checker.isPalindrome(word);

if (isPalindrome) {
System.out.println(word + " is a palindrome");
} else {
System.out.println(word + " is not a palindrome");
}
}
}