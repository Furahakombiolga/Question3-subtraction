import java.util.Random;
import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Randomly generate two single-digit integers
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        // Function to make sure number1 is always greater than number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Ask student to solve the subtraction question
        System.out.println();
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = scanner.nextInt();

        // Check the student's answer and display the result
        if (answer == number1 - number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The answer is " + (number1 - number2));
        }

        scanner.close();
    }
}
