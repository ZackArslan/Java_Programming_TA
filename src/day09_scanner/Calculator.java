package day09_scanner;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter a math operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double result = 0.0;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Cannot divide by zero!");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid entry!");
            System.exit(0);
        }

        System.out.println("Result: " + result);
        input.close();









        /*
        create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"

         */
    }
}
