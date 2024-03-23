import java.util.Scanner;

interface PasswordChecker {
    String checkLength(String password);
    String checkComplexity(String password);
}

class SimplePasswordChecker implements PasswordChecker {
    @Override
    public String checkLength(String password) {
        int length = password.length();
        return "Length: " + length;
    }

    @Override
    public String checkComplexity(String password) {
        // Check if the password contains any special characters
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
        // Check if the password contains both letters and numbers
        boolean hasLettersAndNumbers = password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*");

        if (hasSpecialChar && hasLettersAndNumbers) {
            return "Strong";
        } else if (!hasSpecialChar && hasLettersAndNumbers) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
}

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        PasswordChecker simpleChecker = new SimplePasswordChecker();

        System.out.println(simpleChecker.checkLength(password));
        System.out.println(simpleChecker.checkComplexity(password));

        scanner.close();
    }
}
