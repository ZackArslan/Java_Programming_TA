package day13_customMethods;

import java.util.Scanner;

public class warmupTasks {

    public static void main(String[] args) {

        calculate(200,5,'/');

      /*  Scanner input= new Scanner(System.in);
        System.out.println("enter your two numbers and math operators");
        double n1= input.nextDouble();
        double n2= input.nextDouble();
        char operators= input.next().charAt(0);
        calculate(n1,n2,operators);

       */   //Scanner method

        ageGroup(75);





    }
    public static void calculate(double num1,double num2, char mathOperator){



        switch (mathOperator){
            case'+':
                System.out.println(num1+" "+mathOperator+" "+num2+"="+(num1+num2));
                break;
            case '-':
                System.out.println(num1+" "+mathOperator+" "+num2+"="+(num1-num2));
                break;
            case '*':
                System.out.println(num1+" "+mathOperator+" "+num2+"="+(num1*num2));
                break;
            case '/':
                System.out.println(num1+" "+mathOperator+" "+num2+"="+(num1/num2));
                break;
            default:
                System.err.println("invalid operators");
        }

    }
    public static void ageGroup(int age){

        if(age>=0 && age<=150){
            System.out.println((age<21)?"Teenager":(age>=21&&age<55)?"Adult":"Senior");
        }else {
            System.err.println("invalid age");
        }


    }
}
