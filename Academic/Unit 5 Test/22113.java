package q22113;

public class CTJ22113 {
public static int countSteps(String s) {
int num = Integer.parseInt(s, 2); 
int steps = 0;

while (num != 1) {
if (num % 2 == 0) {
num /= 2;
} else {
num++;
}
steps++;
}

return steps;
}

public static void main(String[] args) {
String input1 = "1101";
String input2 = "10";
String input3 = "1";

int output1 = countSteps(input1);
int output2 = countSteps(input2);
int output3 = countSteps(input3);

System.out.println(input1);
System.out.println(output1);
System.out.println(input2);
System.out.println(output2); 
System.out.println(input3);
System.out.println(output3); 
}
}