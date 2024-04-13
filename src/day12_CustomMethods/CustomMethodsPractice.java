package day12_CustomMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        //create a method that can print the maximum number between two numbers, if both are equal then print "equal"

        //create a method that can display the initials of a person

        maxNum(10000,5000);
        System.out.println("----------------");
        maxNum(-200,-20);
        System.out.println("----------------");
        maxNum(20.5,10.7);
        System.out.println("----------------");
        initial("Tilbe","Arslan");

    }
    public static void maxNum(double num1, double num2){

        if(num1>num2){
            System.out.println(num1+" is the maximum number");
        }else if (num2>num1){
            System.out.println(num2+" is the maximum number");
        }else{
            System.out.println("Equal");
        }
    }
    public static void initial(String firstName,String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);

        System.out.println(initial);


    }
}
