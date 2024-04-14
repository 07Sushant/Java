import java.io.*;
import java.util.*;

public class WordFrequencyAnalyzer {
public static void main(String[] args) {
String fileName = args[0];
File file = new File(fileName);

if (!file.exists()) {
System.out.println("File does not exist");
return;
}

Map<String, Integer> wordCount = new TreeMap<>();

try (BufferedReader br = new BufferedReader(new FileReader(file))) {
String line;
while ((line = br.readLine()) != null) {
String[] words = line.split("\\s+");
for (String word : words) {
word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
if (!word.isEmpty()) {
wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
}
}
}
} catch (IOException e) {
e.printStackTrace();
}

for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}