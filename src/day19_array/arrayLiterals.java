package day19_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayLiterals {
    public static void main(String[] args) {

        int[] numbers= new int[5];  //if you dont know what the elements are but you know length

        int[] nums= {10,20,30,40,50}; //array literal : if you know the exact elements and length

        System.out.println(numbers.length);  //5
        System.out.println(nums.length);   //5

        System.out.println("_-----------------------");
        //element:        1         2          3           4        5         6          7
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
         //index          0         1          2           3        4         5         6
        int n =1;
        System.out.println(days[n-1]);

        System.out.println("_-----------------------");

        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.println(Arrays.toString(month));

        int num=10;

        System.out.println(month[num-1]);

        System.out.println("_----------------------------------");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);  //reverse to months
        }





    }
}
