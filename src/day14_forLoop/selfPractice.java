package day14_forLoop;

import java.util.Scanner;

public class selfPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int max=-2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number= input.nextInt();
            if(number>max){
                max=number;

            }

        }
        System.out.println("Max:"+max);

        System.out.println("Min: "+min());

    }
    public static int min(){
       Scanner input = new Scanner(System.in);
        int min=2147483647;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int number= input.nextInt();
            if(number<min){
                min=number;
            }
        }
        return min;
    }
}
