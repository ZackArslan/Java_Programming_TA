package day11_string;

import java.util.Scanner;

public class combineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String first= input.nextLine();
        System.out.println("Enter your second word:");
        String second = input.nextLine();

        if(first.indexOf(first.length()-1)==second.indexOf(0)){
            System.out.println(first.concat(second.substring(0)));
        }else{
            System.out.println(first.concat(second));
        }





        /*
        Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
         */
    }
}
