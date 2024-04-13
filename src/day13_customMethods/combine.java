package day13_customMethods;

import java.util.Scanner;

public class combine {
    public static void main(String[] args) {
        System.out.println(combine("one","eight"));

    }

    public static String combine(String str1,String str2){

        return (str1.substring(str1.length()-1).equals(str2.substring(0,1)))?
                str1.substring(0)+str2.substring(1) : str1+str2;
    }


    }

