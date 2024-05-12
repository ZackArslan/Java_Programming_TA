package day19_array;

import java.util.Arrays;

public class maximumNumber {
    public static void main(String[] args) {

        int[] number= {100,20,500,40,-10,30};

        int max=number[0]; //first we assume that first number is the msx number
        for (int i = 1; i < number.length; i++) {
            if(number[i]>max){  //compares the element of the array with current max number
                max=number[i];  //replace the current max number
            }
        }
        System.out.println("Max= "+max);






    }
}
