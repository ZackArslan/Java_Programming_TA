package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number");
        int number = sc.nextInt();
        sum+=number;
        while(number>0){
            System.out.println("Enter a number");
            number = sc.nextInt();
            if(number<0){
                break;
            }else{
                sum+=number;
            }
        }

        System.out.println(sum);


/*
5. Create a class named UntilNegative and Write a program
that calculates the sum of numbers entered by the
user until user enters a negative number.


 */

    }
}
