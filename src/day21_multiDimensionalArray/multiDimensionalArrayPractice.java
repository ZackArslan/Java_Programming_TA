package day21_multiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArrayPractice {
    public static void main(String[] args) {

        String [] group1={"Tilbe","Zack","Daniel","Max"};
        String [] group2={"Lex","Bob","Tom"};
        String [] group3={"Ali","Veli","Leyla","Ahmet","Mehmet"};
        String [] group4={"Alev","Refik"};

        String [][] groups={group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
        String[] each1D = groups[i];
            System.out.println(Arrays.toString( each1D));

            for (int j = 0; j < each1D.length; j++) {
                System.out.println(each1D[j]);
            }
        }
        System.out.println("------------------------------");
        //for each loop
        for (String[] each1D : groups) {
            System.out.println(Arrays.toString(each1D));
            for (String eachElement : each1D) {
                System.out.println(eachElement);
            }
        }
        System.out.println("------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup=groups[i];
            System.out.println(Arrays.toString(eachGroup));//reversing the 4 group first

            for (String eachElement : eachGroup) {
                System.out.println(eachElement);
            }
        }




    }
}
