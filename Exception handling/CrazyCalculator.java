import java.util.Scanner;

public class CrazyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Request first number from user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            // Request second number from user
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // perform division
            int result = num1 / num2;

            // display result and exception handling
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero!");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
