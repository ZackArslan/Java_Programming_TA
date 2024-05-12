package day19_array;

import java.util.Arrays;

public class arraysPractice1 {
    public static void main(String[] args) {

        String[] names=new String[5];
        names[0]="Tilbe";
        names[1]="Zack";
        names[2]="Alev";
        names[3]="Ayse";
        names[4]="Cansu";

        System.out.println(Arrays.toString(names));

        names[4]="zeynep";   //we can re-assign the variables

        System.out.println(Arrays.toString(names)); //here it will print index 4 as "zeynep" instead "cansu"

        System.out.println("----------------");

        for (int i = names.length-1; i >= 0 ; i--) {
            System.out.println(names[i]);
        }

        System.out.println("-----------------------");

        // shortcut of reverse and loop : call the name of the array ex: names.fori = this for loop
        // or : names.forr = this is for reverse





    }
}
