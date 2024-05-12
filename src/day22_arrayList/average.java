package day22_arrayList;

import java.util.ArrayList;

public class average {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(12);

        double average=0;
        double sum=0;

        for (Integer each : numbers) {
            sum+=each;
            average=sum/numbers.size();
        }
        System.out.println(average);




        /*
        Write a program that can find the average number from an arrayList of integers
         */
    }
}
