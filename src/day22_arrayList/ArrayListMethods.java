package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
  //--------------add method---------------------------
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);  //index: 0
        list.add(20);  //index: 1
        list.add(30);
        list.add(10); //it accepts duplicates
        //list.add(5.5); we can only add integer because we assign as integer at first

        list.add(1,15);  //we add 15 to index 1 //10,15,20,30,10

        System.out.println(list);

        //------------------get method-----------------

        System.out.println("--------------------");

        ArrayList<String> studentList=new ArrayList<>();

        studentList.add("Tilbe");
        studentList.add("Zack");
        studentList.add("Ali");
        studentList.add("Max");

        System.out.println(studentList.size()); //4
        System.out.println(studentList);

        String firstStudent=studentList.get(0);
        System.out.println(firstStudent);

        String lastStudent=studentList.get(studentList.size()-1);
        System.out.println(lastStudent);

        System.out.println("--------------------");


    }
}
