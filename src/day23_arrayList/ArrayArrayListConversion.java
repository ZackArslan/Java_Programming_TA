package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {

        String [] arr = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // this is how we convert the array to arraylist

        System.out.println(list);


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));

        String [] languages = list2.toArray(new String[0]); // this is how you convert the arraylist to Array basicly we are unboxing

        System.out.println(Arrays.toString(languages));

        System.out.println("---------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(10,20,30,40,50,60));

        Integer [] nums = list1.toArray(new Integer[0]);

        System.out.println(nums);


    }
}
