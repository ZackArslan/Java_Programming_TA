package day19_array;

import java.util.Arrays;

public class AlphabetLetter {
    public static void main(String[] args) {

        char[] letters=new char[26];
        char[] letterDescending= new char[26];

        for (int i = 0,j='A',k='Z'; i < letters.length; i++,j++,k--) {
            letters[i]=(char) j;
            letterDescending[i]=(char) k ;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(letterDescending));



    }
}
