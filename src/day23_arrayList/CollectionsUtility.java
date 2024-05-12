package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {


        ////// min() and max() method

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,10));

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("----------------------------------");

        ///// sort() method

        ArrayList<String> items = new ArrayList<>();

        items.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("----------------------------------");

        ////reverse() method


        Collections.reverse(items);

        System.out.println(items);


        System.out.println("----------------------------------");

        //// swap()

        ArrayList <String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Zack","Tilbe","Batu","Recep"));

        System.out.println(students);

        Collections.swap(students,2,3);

        System.out.println(students);

        Collections.swap(students,0,students.size()-1);

        System.out.println(students);


    }
}
