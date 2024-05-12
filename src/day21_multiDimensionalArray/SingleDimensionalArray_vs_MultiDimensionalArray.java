package day21_multiDimensionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_MultiDimensionalArray {
    public static void main(String[] args) {

        int [] arr1d = new int [10];

        System.out.println(Arrays.toString(arr1d)); // default value of int is 0

        int [] []  arr2D = new int [5] []; // in order to how many 1D need to be store in 2D we have give that number in the first bracket

        System.out.println(Arrays.deepToString(arr2D)); // default value of array is null


        // how to assign the arrays to 2D array

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8};
        int [] arr3 = {9,10};
        int [] arr4 = {11,12,13,14,15};
        int [] arr5 = {16,17,18,19,20,21};


        arr2D[0]=arr1;
        arr2D[1]=arr2;
        arr2D[2]=arr3;
        arr2D[3]=arr4;
        arr2D[4]=arr5;

        System.out.println(Arrays.deepToString(arr2D));

    }
}
