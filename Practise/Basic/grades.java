public class grades {
    public static void main(String args[]) {
        System.out.println("Enter the number between 1-100: \n" + args[0]);
        if (args.length < 1) {
            System.out.println("Please enter only one number.");
            return;
        }
        int number = Integer.parseInt(args[0]);
        if (number >= 96 && number <= 100) {
            System.out.println("Grade A+");
        } else if (number >= 91 && number <= 95) {
            System.out.println("Grade A");
        } else if (number >= 81 && number <= 90) {
            System.out.println("Grade B+");
        } else if (number >= 71 && number <= 80) {
            System.out.println("Grade B");
        } else if (number >= 61 && number <= 70) {
            System.out.println("Grade C");
        } else if (number >= 51 && number <= 60) {
            System.out.println("Grade C+");
        } else if (number >= 35 && number <= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}