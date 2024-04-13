package day06_IfStatementsTA;

public class WeekDaysTA {
    public static void main(String[] args) {

        int number = 5;
        String days = "";

        if(number == 1 ){
            days = "Monday";
        } else if (number==2) {
            days ="Tuesday";
        }else if (number==3){
            days = "wednesday";
        } else if (number==4) {
           days = "thursday";
        } else if (number==5) {
            days = "friday";
        } else if (number==6) {
            days = "saturday";
        } else if (number==7) {
            days="friday";
        }

        System.out.println(days);

    }
}
/*
An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents

Ex:
Given:
number = 1

output:
Monday

Hint: Assume that a number between 1 ~ 7 is given to the variable
 */