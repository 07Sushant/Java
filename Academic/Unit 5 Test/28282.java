import java.io.*;

public class AppendToFile {

public static void main(String[] args) {
try {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the file name:");
String fileName = reader.readLine();

File file = new File(fileName);

if (!file.exists()) {
System.out.println("File does not exist");
return;
}

System.out.println("Enter the content to append:");
String content = reader.readLine();

FileWriter fileWriter = new FileWriter(file, true);
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

bufferedWriter.write("\n"); // Add a line break before appending content
bufferedWriter.write(content);
bufferedWriter.newLine();

bufferedWriter.close();

FileReader fileReader = new FileReader(file);
BufferedReader bufferedReader = new BufferedReader(fileReader);

String line;
while ((line = bufferedReader.readLine()) != null) {
System.out.println(line);
}

bufferedReader.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}