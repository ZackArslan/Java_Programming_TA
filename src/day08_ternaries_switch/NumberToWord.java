package day08_ternaries_switch;

public class NumberToWord {
    public static void main(String[] args) {

        int number = 10;

        String word= (number>=0&&number<=9)?(number==0)?"zero":(number==1)?"one":(number==2)?"two"
                :(number==3)?"three":(number==4)?"four":(number==5)?"five":(number==6)?"six"
                :(number==7)?"seven":(number==8)?"eight":"nine":"invalid";

        System.out.println(word);










       /* Create a class called NumberToWord,
                write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

        Note: MUST use ternary

        */


    }
}
