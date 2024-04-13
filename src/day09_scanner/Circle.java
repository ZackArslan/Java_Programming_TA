package day09_scanner;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area and perimeter
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        // Display the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

        // Close the scanner
        input.close();



        /*
        Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

         */













    }
}
