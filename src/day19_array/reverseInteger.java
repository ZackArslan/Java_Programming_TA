package day19_array;

import java.util.Arrays;

public class reverseInteger {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        int reversedArray=0;
        for (int i = 0; i < arr.length; i++) {
         reversedArray=  arr[i]=5-i;

        }
        System.out.println("reversedArray = " + Arrays.toString(arr));


        /*
        Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

         */
    }
}
