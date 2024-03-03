package q11266;

class Addition {
public static int add(int a, int b) {
return a + b;
}

public static float add(int a, float b) {
return a + b;
}

public static float add(float a, float b) {
return a + b;
}

public static double add(float a, double b, double c) {
return a + b + c;
}

public static void main(String[] args) {
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
float c = Float.parseFloat(args[2]);
float d = Float.parseFloat(args[3]);
double e = Double.parseDouble(args[4]);
double f = Double.parseDouble(args[5]);

System.out.println("Sum of " + a + " and " + b + " is " + add(a, b));
System.out.println("Sum of " + c + " and " + d + " is " + add(c, d));
System.out.println("Sum of " + b + " and " + d + " is " + add(b, d));
System.out.println("Sum of " + c + ", " + e + " and " + f + " is " + add(c, e, f));
}
}
