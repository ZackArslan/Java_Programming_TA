package day12_CustomMethods;

public class CustomMethodsWithParameter {
    public static void main(String[] args) {

        oddOrEven(100);
        System.out.println("-------------");
        oddOrEven(10000);
    }

    //the method takes an argument number and verifies if the number is odd or even number
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is an even number");
        }else{
            System.out.println(number+" is an odd number");
        }
    }

    //create a method that can check if the person is eligible to buy alcohol (age)

    //create a method that can check if a number is odd or even or zero (number)

    //create a method that can calculate the grade of the students (score)

    //create a method that can print the maximum number between two numbers, if both are equal then print "equal"

    //create a method that can display the initials of a person







}
