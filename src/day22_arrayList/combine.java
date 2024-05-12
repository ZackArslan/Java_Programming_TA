package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class combine {
    public static void main(String[] args) {

       String[] arr1={"A", "B", "C"};
       String[] arr2={"D", "E", "F", "G"};

       ArrayList<String> combine=new ArrayList<>();


     // combine.add(Arrays.toString(arr1));
    //  combine.add(Arrays.toString(arr2));

        for (String each : arr1) {
            combine.add(each);
        }
        for (String each2 : arr2) {
            combine.add(each2);
        }
        System.out.println(combine);








        /*
        write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

         */
    }
}
