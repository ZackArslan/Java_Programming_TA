package day09_scanner;
import java.util.Scanner;
public class PlaceAndOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name");

        String product = input.nextLine();

        System.out.println("Enter the prices");

        double price = input.nextDouble();

        System.out.println("Enter the quantity");

        int quantity = input.nextInt();

        System.out.println("Enter first name");

        String name= input.next();

        double total = price*quantity;

        System.out.println(name+" your order for " + quantity + product +" has been places. Your total is " +total);
        input.close();




        /*

7. Create a class named PlaceAnOrder:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
         */







    }
}
