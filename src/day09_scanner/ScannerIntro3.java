package day09_scanner;

import java.util.Scanner;
public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("enter a character");
        char ch= input.next().charAt(0);

       // System.out.println("you have entered: "+ch);

        System.out.println("would you like to continue");

        String answer = input.next(); // you can answer multiple questions

       // String answer= input.nextLine(); //you can only answer 1 question

        System.out.println("you have entered: "+ answer);

        input.close();

        //next method you only get 1 word till space
        //   yes i know : you will get yes as answer










    }
}
