package day23_arrayList;

import java.util.ArrayList;

public class uniqueElement {
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

        for (String each : names) {
            if(names.indexOf(each)== names.lastIndexOf(each)){
                System.out.println(each);
                break;  //first unique then stop the program
            }
        }



    }
}
