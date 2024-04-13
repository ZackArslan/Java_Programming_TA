package day06_IfStatementsTA;

public class IdentifyNumberTA {
    public static void main(String[] args) {

        int number = 200;
        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = !positive && !negative;

        System.out.println(number + " is positive number:" + positive);
        System.out.println(number + " is negative number:" + negative);
        System.out.println(number + " is zero:" + zero);










    }








}
