package q27403;

import java.util.Scanner;

interface Transformer {
String transform(String input);
}

public class StringTransformer {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String inputString = scanner.nextLine();

Transformer uppercaseConverter = new Transformer() {
@Override
public String transform(String input) {
return input.toUpperCase();
}
};

String transformedString = uppercaseConverter.transform(inputString);
System.out.println(transformedString);

scanner.close();
}
}