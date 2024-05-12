package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        //toString method
        int[] score={70,80,90,65,100};

        System.out.println(Arrays.toString(score));

        String result=Arrays.toString(score); //we can assign in a new string

        System.out.println(result);

        System.out.println("---------------------------");
        //equals method

        int[] a1={1,2,3,4,5};
        int[] a2={1,2,3,4,5};

       boolean r1= Arrays.equals(a1,a2);

        System.out.println(r1);  //true

        char[] ch={'A','B','C'};
        char[] ch1={'A','C','B'};

        boolean r2=Arrays.equals(ch,ch1);

        System.out.println(r2); //false because needs to be in same order A B C

        String[] s1={"A","B","C"};
        String[] s2={"A","C","B"};

        System.out.println(Arrays.equals(s1,s2)); //false  not same order

        System.out.println("-----------------------");
        //sort method

        int[] nums={100,80,90,75,88,99,0,5,4,1000,500};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  //smaller than bigger  0,4,5,75.....

        System.out.println("Minimum number= "+nums[0]);
        System.out.println("Maximum number= "+nums[nums.length-1]);

        System.out.println("---------------------------------");

        String[] b1={"C","B","A"};
        String[] b2={"A","C","B"};

        Arrays.sort(b1);  //putting them same order  //A B C
        Arrays.sort(b2);   //A B C

        System.out.println(Arrays.equals(b1,b2));  //true because we sort them

        String[] students={"Yaxier","Madivac","Ali","Abdullah","Alena"};

        Arrays.sort(students);  //sort them alphabetic order

        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------");
        //copyOf method

        int[] array={10,20,30,40,50,60,70};

        int[] array2=Arrays.copyOf(array,7);  //if i want to get all 7 number then i write 7 or i can give different number

        System.out.println(Arrays.toString(array2));

        System.out.println("----------------------------");

        int[] n1={1,2,3,4,5};
        int[] n2={6,7,8,9,10,11,12};

        int[] n3= Arrays.copyOf(n1,n1.length+n2.length);

        for (int i = 0, j=n1.length; i < n2.length; i++,j++) {
            n3[j]=n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("--------------------------");
        //copyOfRange method

        char[] ch3={'A','B','C','D','E','F','G'};
        //index      0    1   2  3    4  5   6

        char[] result1=Arrays.copyOfRange(ch3,2,5);  //excludes ending index

        System.out.println(Arrays.toString(result1));

        char[] result3=Arrays.copyOfRange(ch3,2,ch.length); //from C to G

        System.out.println(Arrays.toString(result3));

    }
}
