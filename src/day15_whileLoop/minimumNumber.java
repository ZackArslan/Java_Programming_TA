package day15_whileLoop;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int min=2147483647;  //any number will be less than that number thats why we are entering largest number of integer

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number= input.nextInt();

            if(number<min){
                min=number;
            }
        }
        System.out.println("Min= "+min);
        //everything inside the loop except print statement

        input.close();



    }
}
