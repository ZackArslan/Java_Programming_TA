package day21_multiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multiDimensionalArrayIntro {
    public static void main(String[] args) {

        int [][] arr2D={ {10,20,30}, {40,50,60,70}, {80,90}};

        //                   1              2             3   length
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.toString(arr2D[0]));

        System.out.println(arr2D[2][0]); // 80
        System.out.println(arr2D[1][2]); // 60
        System.out.println(arr2D[0][1]); // 20



    }
}
