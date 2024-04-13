package day07_ifStatementsTA;

public class IfStatementsWithoutCurlyBracesTa {
    public static void main(String[] args) {

        int age = 32;

        if(age >=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }

        System.out.println("-------------------");

        if(age>=21) System.out.println("elgible");
        else System.out.println("not eligible");

        System.out.println("-------------------");

        int itemNumber = 3;

        if(itemNumber==1)
            System.out.println("eggs");
            //System.out.println("orange"); //only 1 statement you dont need use curly braces but if 2;have to
        else if (itemNumber==2) {
            System.out.println("milk");
            System.out.println("onion");
        }else {
            System.out.println("apple");
            System.out.println("cherry");
        }
        System.out.println("----------------");

        int day =2;

        if(day==1) System.out.println("monday");
        else if (day==2) System.out.println("tuesday");
        else if (day==3) System.out.println("wednesday");
        else if (day==4) System.out.println("thursday");
        else if (day==5) System.out.println("friday");
        else if (day==6) System.out.println("saturday");
        else System.out.println("sunday");     //giving curly braces is better always!!!
        // without curly braces NOT good practice





    }
}
