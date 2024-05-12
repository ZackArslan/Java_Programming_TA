package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveToZeros {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

       // Collections.sort(list);
        //System.out.println(list);

        int zeroCount = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                zeroCount++;
                i--;
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }

        System.out.println(list);


        /*
        Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
       */
    }
    }

