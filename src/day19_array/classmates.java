package day19_array;

import java.util.Arrays;

public class classmates {
    public static void main(String[] args) {

        String[] classMates= {"Zack Arslan","Tilbe Arslan","Max Tom","Lex York","Daisy Prag"};



        for (int i = 0; i < classMates.length; i++) {

            String first= classMates[i].charAt(0)+"";
            String second= classMates[i].charAt(classMates[i].indexOf(" ")+1)+"";

            System.out.println(first+"."+second);


        }

       // String initials=classMates[i].charAt(0)+"." +classMates[i].charAt(classMates[i].indexOf(" ")+1);
     //   System.out.println(initials);




        /*
        create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */
    }
}
