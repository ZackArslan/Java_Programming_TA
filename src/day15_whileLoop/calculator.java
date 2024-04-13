package day15_whileLoop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1= input.nextDouble();

        System.out.println("Enter your second number");
        double num2= input.nextDouble();

        System.out.println("Enter a math operator");
        char math=input.next().charAt(0);

        while( ! (math=='+'|| math=='-'||math=='*'||math=='/')){
            System.err.println("Invalid operator re enter the math operator");
            math=input.next().charAt(0);
        }

        if(math=='+'){
            System.out.println(num1+num2);
        }else if (math=='-'){
            System.out.println(num1-num2);
        } else if (math=='*') {
            System.out.println(num1*num2);
        }else {
            System.out.println(num1/num2);
        }


    }
}
