package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class charsDigitsLetters {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for(char each : str.toCharArray()){
            if(Character.isDigit(each)) {
                digits.add(each);
            }else if(Character.isLetter(each)) {
                letters.add(each);
            }else{
                specialChars.add(each);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
      /*  String str = "ABCD123$%#@&456EFG!";

        String digit="";
        String letter="";
        String specialChar="";

        for (char each:str.toCharArray()) {
            if(Character.isLetter(each)){
                letter+=each;
            }else if (Character.isDigit(each)){
                digit+=each;
            } else if (!Character.isLetterOrDigit(each)) {
                specialChar+=each;
            }
        }
        ArrayList<String> list1=new ArrayList<>(Arrays.asList(letter));
        ArrayList<String> list2=new ArrayList<>(Arrays.asList(digit));
        ArrayList<String> list3=new ArrayList<>(Arrays.asList(specialChar));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

       */



        /*
        Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}


         */
    }
}
