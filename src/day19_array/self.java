package day19_array;

import java.util.Arrays;

public class self {
    public static void main(String[] args) {

        String[] classMates={"Zack Arslan","Tilbe Arslan","Jack Sparrow","Boncuk Ali"};

        for (int i = 0; i < classMates.length; i++) {
           classMates[i]= classMates[i].charAt(0)+"."+classMates[i].charAt(classMates[i].indexOf(" ")+1);
            System.out.println(classMates[i]);
        }

        /*
        create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */
        System.out.println("--------------------------------------");

        String[] str= {"Tilbe","Zack","Java"};

       for (int i = 0; i < str.length; i++) {
            String reverse="";
            for (int j = str[i].length() - 1; j >= 0; j--) {
                reverse+=str[i].charAt(j);
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

        System.out.println("---------------------------------------");

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            if(scores[i]>=90){
                grades[i]='A';
            } else if (scores[i]>=80) {
                grades[i]='B';
            } else if (scores[i]>=70) {
                grades[i]='C';
            }else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" score is "+scores[i]+", and grade is "+ grades[i]);
        }
       /*
       Given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
        */

        System.out.println("--------------------------------");

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] result=new int[array.length]; //second array for result

        int j=0;  //index number

        for (int i = 0; i < array.length; i++) {
           if(array[i]!=0){
              result[j++]=array[i];     //if array[i] doesn't equal to 0 than result[j++] increase by one and assign to array[i]
           }
        }
        System.out.println(Arrays.toString(result));


        /*
         write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

         */
        System.out.println("---------------------------------------");

         int[] arr1= {1,2,3,4,5};
         int[] arr2= {4,5,6,7,8};

        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr2.length; k++) {
                if(arr1[i]==arr2[k]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }

        /*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
         */

        System.out.println("--------------------------------------");

        int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13};

        int even=0;
        int odd=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
        /*
         Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

         */
        System.out.println("-----------------------------");

        int[] arr3= {1,2,3,4,5};
        int[] arr4= {4,5,6,7,8};

        for (int each : arr3) {
            for (int each2 : arr4) {
                if(each==each2){
                    System.out.print(each+" ");
                }
            }

        }

        /*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
          MUST use for each loops
         */
        System.out.println("--------------------------------------");

        String[] name= {"anna", "level", "Java"};

        int count=0;
        String result1="";
        for (String each : name) {
            for (int i = each.length() - 1; i >= 0; i--) {
                result1+=each.charAt(i);
            }
            if(each.equals(result1)){
                count++;
                result1="";
            }
        }
        System.out.println(count);

        /*
         write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
         */

    }
}

