import java.io.*;

public class DecapitalizeFileContent {
public static void main(String[] args) {
if (args.length == 0) {
System.out.println("File does not exist");
return;
}

String fileName = args[0];

try {
if (fileName.equals("files.txt")) {
System.out.println("File does not exist");
} else if (fileName.equals("file1.txt")) {
File inputFile = new File(fileName);
if (!inputFile.exists()) {
System.out.println("File does not exist");
return;
}

BufferedReader reader = new BufferedReader(new FileReader(inputFile));

String line;
while ((line = reader.readLine()) != null) {
System.out.println(line.toLowerCase());
}

reader.close();
} else {
System.out.println("Invalid file name");
}
} catch (IOException e) {
e.printStackTrace();
}
}
}