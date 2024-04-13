package day09_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); //for reading user inputs

        System.out.println("enter your first number:");

       byte num1= input.nextByte();  //-128- 127

        System.out.println("enter your second number:");

        short num2= input.nextShort();

        System.out.println("enter your third number");

        int num3= input.nextInt();

        System.out.println("enter your Fourth number");

        long num4= input.nextLong();

        input.close(); // scanner is closed,cannot read user inputs again

        /*System.out.println("enter your fifth number");
        int num5= input.nextInt();

        Scanner is closed at line 26,cannot read inputs anymore
         */

        System.out.println("first number"+num1);
        System.out.println("second number"+num2);
        System.out.println("third number"+num3);
        System.out.println("fourth number"+num4);
       // System.out.println("fifth number"+num5);








    }
}
