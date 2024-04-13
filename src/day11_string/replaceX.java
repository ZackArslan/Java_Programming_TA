package day11_string;

import java.util.Scanner;

public class replaceX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();


        String str = word.replace("x", "a").replace("X","a");
        System.out.println(str);

        input.close();


        /*
        Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

         */


    }
}
