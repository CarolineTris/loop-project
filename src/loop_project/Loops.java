package loop_project;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int grade = -1; // Initialize with an invalid grade

        while (grade < 0 || grade > 100) {
            System.out.print("Enter a grade (0-80): ");
            if (scanner.hasNextInt()) {
                grade = scanner.nextInt();
                if (grade < 0 || grade > 80) {
                    System.out.println("Invalid grade. Please enter a number between 0 and 80.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("You entered a valid grade: " + grade);
        scanner.close();

	}

}
