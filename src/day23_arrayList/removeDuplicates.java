package day23_arrayList;

import java.util.ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Zack"); //0
        names.add("Zack"); //0
        names.add("Tilbe"); //1
        names.add("Tilbe"); //1
        names.add("Asli"); //2
        names.add("Meltem");  //3
        names.add("Yale");  //4
        names.add("Didem"); //5
        names.add("Didem"); //5
        names.add("Bade"); // 6

        ArrayList<String> nonDup=new ArrayList<>();

        for (String each : names) {
            if(nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);
        }

        names=nonDup; //we can assign like that also then we can print names itself

        System.out.println(names);
        System.out.println(nonDup);




    }
}
