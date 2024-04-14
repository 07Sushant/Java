public import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaxSubarrayProduct {

public static void main(String[] args) {
String fileName = args[0];
try {
BufferedReader reader = new BufferedReader(new FileReader(fileName));
String line;
int maxProduct = Integer.MIN_VALUE;
while ((line = reader.readLine()) != null) {
String[] numbers = line.split("\\s+");
for (String numStr : numbers) {
try {
int num = Integer.parseInt(numStr);
maxProduct = Math.max(maxProduct, maxSubarrayProduct(num));
} catch (NumberFormatException ignored) {
}
}
}
reader.close();
System.out.println(maxProduct);
} catch (FileNotFoundException e) {
System.out.println("File not found");
} catch (IOException e) {
e.printStackTrace();
}
}

private static int maxSubarrayProduct(int num) {
int maxEndingHere = num;
int minEndingHere = num;
int maxSoFar = num;

for (int i = 1; i < num; i++) {
int temp = maxEndingHere;
maxEndingHere = Math.max(num, Math.max(num * maxEndingHere, num * minEndingHere));
minEndingHere = Math.min(num, Math.min(num * temp, num * minEndingHere));
maxSoFar = Math.max(maxSoFar, maxEndingHere);
}

return maxSoFar;
}
} {

}
