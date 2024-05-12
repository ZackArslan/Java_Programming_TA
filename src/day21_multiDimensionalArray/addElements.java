package day21_multiDimensionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class addElements {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50,60,70,80};


        int element  = 6;

        // can we add element into the array
        // expecting {1,2,3,4,5,6} but not arrays size is fixed


        // this is the formula how to add new element to array

        int [] newArray = Arrays.copyOf(array,array.length+1); // first copying all elements from array and assign new size

        newArray[newArray.length-1] =element;

        System.out.println(Arrays.toString(newArray));

        System.out.println("----------------------------");

        int[] numbers={100,90,80,70,60};

        numbers=ArraysUtility.addElement(numbers,50);  //we called our method from arraysUtility method

        System.out.println(Arrays.toString(numbers));

        System.out.println("----------------------");

        double[] nums={1.5,2.5,3.5};

        nums=ArraysUtility.addElement(nums,5.5);
        nums=ArraysUtility.addElement(nums,6.5);
        nums=ArraysUtility.addElement(nums,7.5);
        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------------");

        String[] names={"Tilbe","Zack","Max"};

        names=ArraysUtility.addElement(names,"Lex");
        names=ArraysUtility.addElement(names,"Daisy");

        System.out.println(Arrays.toString(names));

    }
}
