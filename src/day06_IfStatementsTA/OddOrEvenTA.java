package day06_IfStatementsTA;

public class OddOrEvenTA {
    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number % 2 ==0; // when we divide a number by 2 , if remainder is 0 it means the number is even number
         //when we divide a number by 2 , if remainder is NOT 0 it means the number is odd number
        boolean isOdd = !isEven; //if the number is not even then its odd

        System.out.println(number + " is an even number:" + isEven);
        System.out.println(number + " is an odd number:" +isOdd);












    }











}
