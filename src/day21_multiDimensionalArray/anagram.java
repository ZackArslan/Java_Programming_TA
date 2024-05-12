package day21_multiDimensionalArray;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {

        //if contains same letters it means anagram

        String str1= "heart";  //if we sort that it will be aehrt
        String str2= "earth";

        //String[] a1=str1.split("");
        char[] a1=str1.toCharArray();  //we can use both for splitting
        char[] a2=str2.toCharArray();

       // System.out.println(Arrays.toString(a1)); //[h,e,a,r,t]
       // System.out.println(Arrays.toString(a2)); //[e,a,r,t,h]

        Arrays.sort(a1);
        Arrays.sort(a2);

       // System.out.println(Arrays.toString(a1));  a e h r t
       // System.out.println(Arrays.toString(a2));  a e h r t

        boolean isAnagram=Arrays.equals(a1,a2);

        System.out.println("isAnagram = " + isAnagram);





    }
}
