package day15_whileLoop;

import java.util.Scanner;

public class maximumAndMinimum {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int max=-2147483648;
        int min= 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int number= input.nextInt();

            if(number>max){
                max=number;
            }
            if (number<min){  //we cant use if and else, because will automatically assume min number what you give if it's not max
                min=number;
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);

    }
}
