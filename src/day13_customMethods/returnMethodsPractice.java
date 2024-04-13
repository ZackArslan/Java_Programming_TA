package day13_customMethods;

public class returnMethodsPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(100));
        int num=200;
        if(isEven(num)){
            System.out.println(num+" is even number");
        }else {
            System.out.println(num+" is odd number");
        }
        System.out.println("-----------");
        System.out.println(max(1,3));
    }
    public static boolean isOdd(int number) {
       // return (number % 2 != 0) ? true : false;
        if(number%2!=0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isEven(int number){
        return !isOdd(number);
    }
    public static int max(int n1,int n2){
        return (n1>n2)?n1:n2;
    }
    public static int min(int n1,int n2){
        return (n1<n2)?n1:n2;
    }


    }



/*
create a method named isOdd,that can return true if a number is an odd number
create a method named isEven, that can return true if a number is an even number
crate a method named max, that can return the maximum number between two numbers
crate a method named min, that can return the minimum number between two numbers
 */