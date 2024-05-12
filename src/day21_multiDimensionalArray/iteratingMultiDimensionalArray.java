package day21_multiDimensionalArray;

import java.util.Arrays;

public class iteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr2D={ {10,20,30}, {40,50,60,70}, {80,90}};

        for (int i = 0; i < arr2D.length; i++) {
            int[] each1D=arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for (int j = 0; j < each1D.length; j++) {
                int eachElement=each1D[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("-----------------------------------");
        //for each loop

        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));  //gives single arrays ex: [10,20,30] , [40,50]

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

        System.out.println("-----------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {   //it gets single dim arrays
            for (int j = arr2D[i].length - 1; j >= 0; j--) {  //it gets every single elements
                System.out.println(arr2D[i][j]);   //i= single j=Elements
            }
        }

        System.out.println("-----------------------------------");
        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }


    }

}
