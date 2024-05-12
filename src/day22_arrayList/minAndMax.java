package day22_arrayList;

import java.util.ArrayList;

public class minAndMax {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(-1);
        System.out.println(numbers);

        int max= numbers.get(0);
        int min=numbers.get(0);

        for (Integer each : numbers) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        /*
        Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

         */
    }
}
