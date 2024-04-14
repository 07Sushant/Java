import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContentReplace {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String fileName = scanner.nextLine();

String searchContent = scanner.nextLine();

String replacementContent = scanner.nextLine();

try {
BufferedReader reader = new BufferedReader(new FileReader(fileName));
StringBuilder fileContent = new StringBuilder();
String line;
int lineCount = 0;

while ((line = reader.readLine()) != null) {
lineCount++;
if (lineCount != 2) { // Exclude the second line
fileContent.append(line).append("\n");
}
}
reader.close();

String updatedContent = fileContent.toString().replace(searchContent, replacementContent);

if (updatedContent.equals(fileContent.toString())) {
System.out.println("Word not found");
} else {
// Writing updated content to file
BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
writer.write(updatedContent);
writer.close();
System.out.println(updatedContent);
}

} catch (IOException e) {
System.out.println("File not found");
}
}
}