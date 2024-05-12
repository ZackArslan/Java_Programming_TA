package day19_array;

import java.util.Arrays;

public class arrayPractice2 {
    public static void main(String[] args) {

        int[] numbers=new int[100];


      /*  for (int i = 0,j=1; i < numbers.length; i++,j++) {

           numbers[i]=j;      //this is one way

       */

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;    //another way to find 1 to 100
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------");

        int[] arr2=new int[100];   //0-99 = index

        /* for (int i = 0,j=100; i < arr2.length; i++,j--) {
            arr2[i]=j;     //first way reverse number 100 to 1
        }
         */

        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=100-i;   //another way to reverse number 100 to 1
        }


        System.out.println(Arrays.toString(arr2));

    }
}
