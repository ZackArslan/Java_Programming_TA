package day10_string;
import java.util.Scanner;
//import java.lang.String; it gives implisivly you dont have to write manuelly
//import java.lang.System;
public class StringIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println();
        input.close();
        System.out.println("---------------------");

        String s1="Cat";
        String s2= "Dog";

        String s3= "Cat";
        String s4="Cat";
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);
        System.out.println("-------------------");
        String str1=new String("Java"); //creates two objects 1 string pool 2 in heap (outside string)
        String str2= new String("Java");
        System.out.println(str1==str2);

        System.out.println("-------------------");

        String t1= "Phyton";
        String t2 = new String("Phyton");
        String t3 = new String("Phyton");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1==t2);
        System.out.println(t3==t2);











    }
}
