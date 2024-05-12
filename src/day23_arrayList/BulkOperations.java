package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        //------------------------addAll()--------------------//
        // when ever you call addAll you need to provide collection .
        // you can use asList() method to pass values as a collection.
        // students.addAll(Arrays.asList....   --> this is how you can pass elements as a collection

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);



        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.addAll(1,number); // first index number second collection type


        System.out.println(list);


        System.out.println("-----------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,95,80)); // this is how we can pass multiple elements to arraylist as a collection

        System.out.println(scores);


        System.out.println("-----------------------------------");


        ArrayList<String> students = new ArrayList<>();


        students.addAll(Arrays.asList("Zack","Tilbe","Soner","Adem"));

        System.out.println(students);

        students.addAll(2,Arrays.asList("Kerim","Mahmut","Abdulrezzak")); // original element will display after i insert this elements

        System.out.println(students);


        System.out.println("-----------------------------------");

        Integer [] nums = {1,2,3,4,5,6,7,8}; // you can not simply add all with as list because it needs to be collection

        ArrayList<Integer> j1 = new ArrayList<>(Arrays.asList(nums)); // first way

        j1.addAll(Arrays.asList(nums)); // second way

        System.out.println(j1);

        System.out.println("-----------------------------------");

        //_----------------------containsAll()---------------------//


        ArrayList<String> employeeList = new ArrayList<>();

        employeeList.addAll(Arrays.asList("Zack","Artem","Can","Can"));

        System.out.println(employeeList);

        boolean hasZack = employeeList.contains("Zack"); // it will check only one element, in order to check many elements use below method

        boolean hasZackATilbe = employeeList.containsAll(Arrays.asList("Zack","Tilbe")); // as long as one of them not in the arrayList you will get fals

        boolean hasZackTilbeSoner = employeeList.containsAll(Arrays.asList("Zack","Artem","Can"));

        System.out.println("hasZack = " + hasZack);
        System.out.println("hasZackATilbe = " + hasZackATilbe);
        System.out.println("hasZackTilbeSoner = " + hasZackTilbeSoner);

        System.out.println("-----------------------------------");

        //_----------------------removeAll()---------------------//


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));

        list1.removeAll(Arrays.asList(10,20));

        System.out.println(list1);

        System.out.println("-----------------------------------");

        //_----------------------retainAll()---------------------//

        // it is going to remove unmathcing eleements

        ArrayList<String> developers = new ArrayList<>();

        developers.addAll(Arrays.asList("Zack","Artem","Can","Can","Batu","Tilbe","Recep","Burky"));


        developers.retainAll(Arrays.asList("Artem","Can","Tilbe","Recep","Burky"));

        System.out.println(developers);

        System.out.println("------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.addAll(
                Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels")
        );

        groceriesList.retainAll(Arrays.asList("Eggs","Potato","Milk","Tomato"));

        System.out.println(groceriesList);




    }
}
