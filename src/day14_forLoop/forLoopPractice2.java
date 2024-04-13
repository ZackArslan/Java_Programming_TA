package day14_forLoop;

import java.util.Scanner;

public class forLoopPractice2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int sum=0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            sum+= input.nextInt();
        }

        System.out.println("sum = " + sum);




        //write a program that can ask the user enter a number for five times,print the maximum number

        int max=0;

        for(int i =0; i<5;i++){
            System.out.println("Enter a number");
          int number=input.nextInt();
            if (i == 0 || number > max) {
                max = number;
        }}
        System.out.println("max= "+ max);


        ////write a program that can ask the user enter a number for five times,print the minimum number


        int min=0;

        for(int i =0; i<5;i++){
            System.out.println("Enter a number");
            int number=input.nextInt();
            if (i == 0 || number < min) {
                min = number;
            }}
        System.out.println("min= "+min);






    }
}
