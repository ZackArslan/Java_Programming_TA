package day07_ifStatementsTA;

public class NestedIfIntroTA {
    public static void main(String[] args) {

        int score = -300;

        if(score>=0&&score<=100){ //if score is valid
            if(score>=60){
                System.out.println("passed");
            }else{
                System.out.println("failed");
            }

        }else{ //if the score is not valid
            System.out.println("invalid score");
        }

        System.out.println("====================");

        int age = -300;

        if(age>=1&&age<=150) {
            if (age >= 21) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }
        }else {
                System.out.println("invalid age");
            }
        System.out.println("-----------------------");

        int day = 100;

        if(day>=1&&day<=7){
            if(day==1){
                System.out.println("monday");
            } else if (day==2) {
                System.out.println("tuesday");

            } else if (day==3) {
                System.out.println("wednesday");

            } else if (day==4) {
                System.out.println("thurday");

            } else if (day==5) {
                System.out.println("friday");

            } else if (day==6) {
                System.out.println("saturday");
            }else {
                System.out.println("friday");
            }


        }else{
            System.out.println("invalid day");

        }











        }
















    }

