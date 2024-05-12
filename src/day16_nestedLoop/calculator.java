package day16_nestedLoop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double result = 0;
        String answer="yes";
        while(answer.equals("yes")){

        System.out.println("Enter your first number:");
        double firstNum = input.nextDouble();
        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0);


        while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.err.println("Invalid operator, please enter valid operator. +,-,*,/ ");
            System.out.println("Enter a math operator:");
            operator = input.next().charAt(0);
        }


        System.out.println("Enter your second number:");
        double secondNum = input.nextDouble();
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            default:
        }

        System.out.println("Result= " + result);

        System.out.println("Would like to continue? Yes/No");
        answer = input.next().toLowerCase();
        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid answer! Please enter yes or no");
            System.out.println("Would like to continue? Yes/No");
            answer = input.next();

            }
        }
    }
}















