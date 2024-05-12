package day19_array;

import java.util.Arrays;

public class arrayObjects {
    public static void main(String[] args) {

        int[] arr1={10,20,30,40,50};
        int[] arr2=arr1;
        int[] arr3=arr2;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        //all the same output

        System.out.println("----------------------");

        String[] a1={"Tilbe","Zack"};  //Garbage collection
        a1=new String[]{"Romeo","Juliet"};

        System.out.println(Arrays.toString(a1));  // output : romeo juliet
    }
}
