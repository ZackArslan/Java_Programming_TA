package day15_whileLoop;

import java.util.Scanner;

public class eligibleToVote {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= input.nextInt();

        while( ! (age>=1&& age<=120)){
            System.err.println("Invalid age, please re-enter your age");
            age= input.nextInt();
        }
        System.out.println("Are you a US citizen");
        String isAmerican= input.next().toLowerCase();

        while( ! (isAmerican.equals("yes")|| isAmerican.equals("no"))){
            System.err.println("Please re-enter");
            System.out.println("Are you a US citizen");
            isAmerican= input.next().toLowerCase();
        }

        if(age>=18 && isAmerican.equals("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

        input.close();


    }
}
