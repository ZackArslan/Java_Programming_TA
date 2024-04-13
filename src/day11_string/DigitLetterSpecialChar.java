package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();
        
        if(str.length()>=1){ //if string has at least 1 char.
            char f = str.charAt(0); //first char. of string
            if(f>='0'&&f<='9'){
                System.out.println("first char is digit");
        } else if (f>='A'&&f<='Z') {
                System.out.println("first char is uppercase letter");
            } else if (f>='a'&&f<='z') {
                System.out.println("first char is lowercase letter");
        }else{
                System.out.println("first char is special char");
            }

    } else{ // if string empty
            System.out.println("String is empty");
        }




    }
}
