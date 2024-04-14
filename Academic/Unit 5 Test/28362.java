import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShortestWordFinder {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the file name: ");
String fileName = scanner.nextLine();

File file = new File(fileName);
if (!file.exists()) {
System.out.println("File not found");
return;
}

try (BufferedReader br = new BufferedReader(new FileReader(file))) {
String line;
String shortestWord = null;
int shortestLength = Integer.MAX_VALUE;

while ((line = br.readLine()) != null) {
String[] words = line.split("\\s+");
for (String word : words) {
word = word.replaceAll("[^a-zA-Z]", "");
if (!word.isEmpty() && word.length() < shortestLength) {
shortestLength = word.length();
shortestWord = word;
}
}
}

if (shortestWord != null) {
System.out.println(shortestWord);
} else {
System.out.println("No valid words found in the file.");
}

} catch (IOException e) {
System.out.println("Error reading the file: " + e.getMessage());
} finally {
scanner.close();
}
}
}