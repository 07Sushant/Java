import java.util.Scanner;

public class WordAnalyzer {
    private String input;

    public WordAnalyzer(String input) {
        this.input = input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        WordAnalyzer wordAnalyzer = new WordAnalyzer(input);
        VowelCounter vowelCounter = wordAnalyzer.new VowelCounter();
        int vowelCount = vowelCounter.countVowels();
        System.out.println(vowelCount);
        scanner.close();
    }

    class VowelCounter {
        public int countVowels() {
            int count = 0;
            for (char c : input.toCharArray()) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }
    }
}