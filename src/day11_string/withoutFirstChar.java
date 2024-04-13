package day11_string;

import java.util.Scanner;

public class withoutFirstChar {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first word:");
        String w1 = input.nextLine();
        System.out.println("Enter your second word:");
        String w2= input.nextLine();

        input.close();

       /*
        w1=w1.substring(1);
        w2=w2.substring(1);
       */
        System.out.println(w1.substring(1)+w2.substring(1));
        //System.out.println(w1+w2);




        /*
        Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
         */
    }
}
