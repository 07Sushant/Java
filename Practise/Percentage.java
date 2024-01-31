
// Enter the number of subjects 
// Enter the Total Marks 
// Marks of all subjects
// Then the Percentage Calculation of all subject them summision



import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CBSE Percentage Calculator");
        System.out.println();
        System.out.println();
        System.out.println("What's the full marks ?");
        int full_marks = scanner.nextInt();

        String[] subjects = {"Maths", "Science", "English", "History", "Biology"};
        float[] marks = new float[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
        
            // Validate input for float
            while (!scanner.hasNextFloat()) {
                System.out.println("Invalid Input. Please enter the marks with decimal.");
                scanner.next(); // Consume the invalid input
            }
            marks[i] = scanner.nextFloat();
        }
                // Marksheet
        System.out.println("\n Marksheet");
        for(int i = 0; i<subjects.length; i++)
        {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        scanner.close();

        // Calculating the Percentage
        float total_Score = 0;
        for (float mark : marks)
        {
            total_Score += mark;
        }

        System.out.println("Calculating Total Percentage: ");
        System.out.println("\n You Percentage is: " + (total_Score/(full_marks*5)*100);
        scanner.close();

    }
}

