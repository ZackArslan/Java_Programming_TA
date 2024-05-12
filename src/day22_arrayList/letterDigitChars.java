package day22_arrayList;

import java.util.ArrayList;

public class letterDigitChars {
    public static void main(String[] args) {

        String str="Wooden Spoon!";

        String digit="";
        String letter="";
        String specialChar="";

        for (char each:str.toCharArray()) {
            if(Character.isDigit(each)){
                digit+=each;
            }
            if(Character.isLetter(each)){
                letter+=each;
            }
            if(!Character.isLetterOrDigit(each)){
                specialChar+=each;
            }

        }
        System.out.println("digit = " + digit);
        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);








        /*
        Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
         */
    }
}
