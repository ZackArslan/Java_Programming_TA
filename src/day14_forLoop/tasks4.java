package day14_forLoop;

public class tasks4 {
    public static void main(String[] args) {

       int result=factorial(5);
        System.out.println(result);
        /*
        Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

          	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


         */

    }
    public static int factorial(int n) {
        int result = 1;
        // Multiply result by numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

}}
