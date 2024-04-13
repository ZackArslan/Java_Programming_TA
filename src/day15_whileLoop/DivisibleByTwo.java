package day15_whileLoop;

public class DivisibleByTwo {
    public static void main(String[] args) {

       int number = 100;
       int number2 = 20;
       int result=0;

       while (number>=number2){
           number-=number2;
           result++;
       }

        System.out.println(result);






        //Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
    }
}
