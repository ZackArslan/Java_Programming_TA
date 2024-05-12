package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListMethods {
    public static void main(String[] args) {

        int array [] = {1,2,3,4,5};
        array [0]=100; // this is how we change value from array

        System.out.println(Arrays.toString(array));

        System.out.println("-----------------");

        // -------------------------set()---------------------//


        ArrayList<String> groceriesList  = new ArrayList<>();


        groceriesList.add("Egg");
        groceriesList.add("Paper Towel");
        groceriesList.add("Apple");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

        // it is impossible to change any value from arraylist but you can use set() method for it

        groceriesList.set(2,"Oranges"); // this is how you change element from arraylist

        System.out.println(groceriesList);


        // -------------------------remove()---------------------//

        /*
        Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
        Params:
        index – the index of the element to be removed
        Returns:
        the element that was removed from the list
        Throws:
        IndexOutOfBoundsException – if the index is out of range (index < 0 || index >=
         */

        // two-way to remove by passing index number or name of element

        groceriesList.remove(0); // by passing index number

        System.out.println(groceriesList);

        groceriesList.remove("Paper Towel"); // by passing name but if this name doesnt match , it will not remove it

        System.out.println(groceriesList);


        System.out.println("------------------------------");

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10); //0
        number.add(20); //1
        number.add(30); //2
        number.add(40); //3
        number.add(50); //4


        //  number.remove(20); // if you want to remove 20 from arraylist you will get error

        number.remove(Integer.valueOf(10)); // convert to primitive to object will remove it

        System.out.println(number);


        System.out.println("------------------------------");

        // -------------------------clear()---------------------//

        // Removes all of the elements from this list. The list will be empty after this call returns.


        number.clear();

        System.out.println(number);


        System.out.println("------------------------------");

        // -------------------------indexOf() and lastIndexOf()---------------------//

        ArrayList<String> names = new ArrayList<>();

        names.add("Zack"); //0
        names.add("Tilbe"); //1
        names.add("Asli"); //2
        names.add("Meltem");  //3
        names.add("Yale");  //4
        names.add("Didem"); //5
        names.add("Bade"); // 6


        System.out.println(names.indexOf("Zack"));
        System.out.println(names.lastIndexOf("Tilbe"));

        System.out.println("------------------------------");
        // -------------------------contains()---------------------//

        boolean hasZack = names.contains("Zack");
        boolean hasAhmet = names.contains("Ahmet");

        System.out.println("hasAhmet = " + hasAhmet);
        System.out.println("hasZack = " + hasZack);


        System.out.println("------------------------------");
        // -------------------------equals()---------------------//

        // order matter

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(10);

        System.out.println(list2);
        System.out.println(list1);

        System.out.println(list1.equals(list2));

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();


        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1==l2); // they are not the same object, so you will get false

        System.out.println(l1.equals(l2)); // you will get true because they are containing same elements


        System.out.println("-------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);


        ArrayList<Integer> n2 = new ArrayList<>();

        n1.add(30);
        n1.add(20);
        n1.add(10);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2)); // you will get false doesnt matter if they are containing same volue they're descending order , it needs to be ascending order to be true

        System.out.println("-------------------------");

        // -------------------------isEmpty()---------------------//


        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());

    }
}
