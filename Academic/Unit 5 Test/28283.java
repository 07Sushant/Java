import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileAnalyzer {

public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

try {
System.out.println("Enter the name of the file:");
String fileName = reader.readLine();

FileReader fileReader = new FileReader(fileName);
BufferedReader bufferedReader = new BufferedReader(fileReader);

int lines = 0;
int words = 0;
int characters = 0;

String line;
while ((line = bufferedReader.readLine()) != null) {
lines++;
String[] wordsArray = line.split("\\s+");
words += wordsArray.length;
characters += line.length();
}

System.out.println("Number of lines: " + lines);
System.out.println("Number of words: " + words);
System.out.println("Number of characters: " + characters);

bufferedReader.close();
} catch (IOException e) {
System.out.println("File does not exist");
} finally {
try {
reader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
}