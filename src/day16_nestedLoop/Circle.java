package day16_nestedLoop;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String answer = "yes";
        double diameter = 0;
        double area = 0;
        double perimeter = 0;
        while (answer.equals("yes")) {

           System.out.println("Enter the radius of the circle:");
           double radius = input.nextDouble();


            if (radius < 0 || radius == 0) {
                System.err.println("Invalid entry for the radius of the circle");
                System.exit(1);
            }


            diameter = radius * 2;
            area = Math.PI * radius * radius;
            perimeter = 2 * Math.PI * radius;
            System.out.println("Diameter= " + diameter + "\nArea= " + area + "\nPerimeter= " + perimeter);
            System.out.println("Would you like to calculate another circle? Yes/No");
            answer = input.next();
            if(answer.equals("no")){
                System.out.println("Thank you for choosing Tilbe's Calculator");
                System.exit(1);
            }

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please enter yes or no");
                System.out.println("Would you like to calculate another circle? Yes/No");
                answer = input.next();
                //if(answer.equals("no")){
                  //  System.out.println("Thank you for choosing Tilbe's Calculator");
                  //  System.exit(1);
               // }
            }
        }

        }




        /*
         Write a program that can calculate the area and perimeter of a circle:
        1. Ask the user "Enter the radius of the circle:"
       if user enters 0 or negative numbers, terminate the program after displaying the error message
        "Invalid Entry for the radius of the circle"

        2. Display:
             1. Diameter of circle
             2. Area of circle
              3. Perimeter of circle

         3. Ask the user "Would you like to calculate another circle?"
               If "yes" --> repeat the previous steps
             If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

       If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

              Hint: you can use  System.exit(1) to terminate the entire program

         */
    }


