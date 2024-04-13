package day11_string;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first strings:");
        String first= input.nextLine();
        System.out.println("Enter your second strings:");
        String second = input.nextLine();

        input.close();

        if(first.length()>second.length()){
            System.out.println("First string is the longest");

        }else if (first.length()<second.length()){
            System.out.println("second string is the longest");
        }else {
            System.out.println("Equal");
        }









        /*
        ask the user to enter two strings
        write a program that can print the longest string
        if both have the same number of characters then print "equal"
         */
    }
}
