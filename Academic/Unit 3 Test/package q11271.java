package q11271;

class Bank {
float calculatelnterest(float principal, int time) {
return 0;
}
}

class SBI extends Bank {
private static final float INTEREST_RATE = 10.8f;

float calculatelnterest(float principal, int time) {
return (principal * time * INTEREST_RATE) / 100;
}
}

class ICICI extends Bank {
private static final float INTEREST_RATE = 11.6f;

float calculatelnterest(float principal, int time) {
return (principal * INTEREST_RATE * time) / 100;
}
}

class AXIS extends Bank {
private static final float INTEREST_RATE = 12.3f;

float calculatelnterest(float principal, int time) {
return (principal * time * INTEREST_RATE) / 100;
}
}

public class Testoverriding {
public static void main(String[] args) {
Bank sbiBank = new SBI();
Bank iciciBank = new ICICI();
Bank axisBank = new AXIS();

float principal = Float.parseFloat(args[0]);
int time = Integer.parseInt(args[1]);

System.out.println("SBI rate of interest: " + sbiBank.calculatelnterest(principal, time));
System.out.println("ICICI rate of interest: " + iciciBank.calculatelnterest(principal, time));
System.out.println("AXIS rate of interest: " + axisBank.calculatelnterest(principal, time));
}
}
