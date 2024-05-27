import java.util.Scanner;

class RBI {
    double intrest_Rate_offered() {
        return 0.0;
    }
}

class SBI extends RBI {
    double intrest_Rate_offered() {
        return 6.5;
    }
}

class HDFC extends RBI {
    double intrest_Rate_offered() {
        return 7.0;
    }
}

class PNB extends RBI {
    double intrest_Rate_offered() {
        return 6.0;
    }
}

class ICIC extends RBI {
    double intrest_Rate_offered() {
        return 6.75;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bank name:");
        System.out.println("1.SBI");
        System.out.println("2.HDFC");
        System.out.println("3.PNB");
        System.out.println("4.ICIC");
        int bankName = scanner.nextInt();

        RBI bank;

        switch (bankName) {
            case 1:
                bank = new SBI();
                break;
            case 2:
                bank = new HDFC();
                break;
            case 3:
                bank = new PNB();
                break;
            case 4:
                bank = new ICIC();
                break;
            default:
                System.out.println("Please select a bank:");
                return;
        }

        System.out.println("Rate of interest for bank " + bankName + " is: " + bank.intrest_Rate_offered() + "%");
    }
}
