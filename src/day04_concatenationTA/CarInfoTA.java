package day04_concatenationTA;

public class CarInfoTA {
    public static void main(String[] args) {
        /*
        Create a class named CarInfo.java
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.
         */

        int year = 2018;
        int price = 19000;

        String miles = "50000 miles",
                make = " Toyoto",
                model = "Cambry",
                color = "red";

        System.out.println( year + make +" "+ model+ ","+miles +", " + color +","+ "$" +price );















    }












}
