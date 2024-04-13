package day14_forLoop;

public class tasks6 {
    public static void main(String[] args) {

        String str="a1b2c3";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                int digit = ch - '0';

                sum += digit;
            }
        }

        System.out.println("Sum of digits: " + sum);
    }







        /*
        Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

         */
    }

