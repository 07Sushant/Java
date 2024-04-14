import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:/Local volume/Programming/Java/IO/read.txt");
            Scanner dataReader = new Scanner(f1);
            int longestWordLength = 0;
            String longestWord = "";

            while (dataReader.hasNextLine()) {
                String fileData = dataReader.next();

                String[] words = fileData.split("\\s+");
                for (String word : words) {
                    int wordLength = word.length();
                    if (wordLength > longestWordLength) {
                        longestWordLength = wordLength;
                        longestWord = word;
                    }
                }
            }
            dataReader.close();
            if (!longestWord.isEmpty()) {
                System.out.println("The longest word in the file is: " + longestWord);
                System.out.println("Length of the longest word: " + longestWordLength);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found.");
            exception.printStackTrace();
        }
    }
}