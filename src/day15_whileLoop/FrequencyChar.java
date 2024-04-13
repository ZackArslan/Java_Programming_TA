package day15_whileLoop;

import java.util.Scanner;

public class FrequencyChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        System.out.println("Enter a char");
        char given = sc.next().charAt(0);
        int result = 0;


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

                if(each==given){
                    result++;
                }
        }

        System.out.println(result);
    }

        /*
        Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
         */
    }

