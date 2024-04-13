package day15_whileLoop;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int max=-2147483648;  //minimum integer number in java //if you enter 0 you will get error if user enter negative number

        //when user enter a number loop checks one by one if user enter 10,5,30,15,20 then loop try them
        //first will try 10 then max number will be 10 after that will check 5 but 5 not>10 so max number still
        //10 after checking all numbers 30 will be max number

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number=input.nextInt();

            if(number>max){
                max=number;    //numbers always greater than int max=-2147483648 but one of the number biggest!
                               //so here we are doing if statement if number greater than maximum then maximum will be my final number after checking all of them
            }
        }
        System.out.println("max= "+max);
        input.close();


        //write a program that can ask the user enter a number for 5 times and find max number
    }
}
