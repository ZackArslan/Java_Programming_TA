package day12_CustomMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Split or no split");
        String split = input.nextLine();
        System.out.println("Enter the number of the people");
        int people = input.nextInt();
        System.out.println("Enter the check amount");
        double totalAmount = input.nextDouble();
        input.nextLine();
        System.out.println("How was the service quality");
        String service = input.nextLine().toLowerCase();
        input.close();
        double tipPer = 0;
        switch (service) {
            case "excellent":
                tipPer = 0.25;
                break;
            case "great":
                tipPer = 0.20;
                break;
            case "good":
                tipPer = 0.15;
                break;
            case "fair":
                tipPer = 0.10;
                break;
            case "poor":
                tipPer = 0.5;
                break;
            default:
        }

        if(split.equalsIgnoreCase("Yes")) {
            System.out.println("Number of people you entered : "+people);
            System.out.println("Total to pay: "+totalAmount);
            System.out.println("Total tip: "+ (totalAmount*tipPer));
            System.out.println("Total per person: "+ (totalAmount+(totalAmount*tipPer)));
            System.out.println("Tip per person: "+ (totalAmount*tipPer)/people);

        }else{

            System.out.println("Total to Pay: "+ (totalAmount+(totalAmount*tipPer)));
        }







        /*
        Create a class called TipCalculator, and write a program for a tip calculator.
	    There will be different service quality benchmarks that will determine the tip given.
	    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

	        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	    The program should ask the user to enter:
	            - Split or No split (Yes or No),
	             - Enter the number of people (number)
	             - Enter the check amount (number)
	             - Service Quality (String)

	    And then it should display:
	             Number of people entered
	             Total to pay
	             Total tip
	             Total per person
	             Tip per person:

		    Ex:
		        Split or No split (Yes or No)?
		        YeS
		        Enter the number of people
		        4
		        Enter the check amount:
		        476
		        How was the service quality? (Excellent/Great/Good/Fair/Poor)
		        ExCElLeNt

		        output:
		            Number of people entered: 4
		            Total to pay: 595.0
		            Total tip: 119.0
		            Total per person: 148.75
		            Tip per person: 29.75
         */






    }
}
