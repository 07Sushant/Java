// TOM
package q29141;
// import java.util.HashMap;
import java.util.Scanner;

public class PalindromeChecker {
public static void main(String[] args){
// write the code..
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
String reverse1 = new StringBuilder(clean).reverse().toString();
boolean isPalindrome = clean.equals(reverse1);
if(isPalindrome){
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// String input = scanner.nextLine();

// if (isPalindrome(input)) {
System.out.println("\"" + input + "\" is a palindrome");
} else {
System.out.println("\"" + input + "\" is not a palindrome");
}

// scanner.close();
}
}
