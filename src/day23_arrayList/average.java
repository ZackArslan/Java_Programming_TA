package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class average {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        
        int sum=0;


        for (Integer each : list) {
            sum+=each;
        }
        double average=sum/(double)list.size();
        System.out.println(average);


    }
}
