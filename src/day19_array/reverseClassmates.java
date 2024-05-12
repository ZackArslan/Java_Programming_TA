package day19_array;

import java.util.Arrays;

public class reverseClassmates {
    public static void main(String[] args) {

        String[] students= {"Zack","Tilbe","Java","Python","Cydeo"};

        for (int i = 0; i < students.length; i++) {
            String name = students[i];
            String reverse = "";

            System.out.println(name);

            for (int j = name.length() - 1; j >= 0; j--) {
                reverse += name.charAt(j);
            }
            System.out.println(reverse);
        }

        /*
        create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */
    }
}
