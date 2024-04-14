import java.io.*;

public class RemoveLineFromFile {

public static void main(String[] args) {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {
System.out.print("Enter the file name: ");
String fileName = reader.readLine();

File file = new File(fileName);
if (!file.exists()) {
System.out.println("File not found");
return;
}

System.out.print("Enter the line number to remove: ");
int lineNumber;
try {
lineNumber = Integer.parseInt(reader.readLine());
} catch (NumberFormatException e) {
System.out.println("Invalid line number");
return;
}

BufferedReader fileReader = new BufferedReader(new FileReader(file));
StringBuilder stringBuilder = new StringBuilder();

String line;
int currentLine = 1;
boolean lineRemoved = false;

while ((line = fileReader.readLine()) != null) {
if (currentLine == lineNumber) {
lineRemoved = true;
} else {
stringBuilder.append(line).append(System.lineSeparator());
}
currentLine++;
}

fileReader.close();

if (!lineRemoved) {
System.out.println("Line not found");
return;
}

FileWriter writer = new FileWriter(file);
writer.write(stringBuilder.toString());
writer.close();

System.out.println("Line removed successfully:");
System.out.print(stringBuilder);

} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
} finally {
try {
reader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
}