package day12_CustomMethods;

import java.util.Scanner;

public class firstAndLastName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String first=input.nextLine();
        System.out.println("Enter your last name:");
        String last= input.nextLine();

        //String first="cyDEo";
        //String last= "SCHOOL";
        first =first.substring(0,1).toUpperCase()+first.substring(1,first.length()).toLowerCase();
        last=last.substring(0,1).toUpperCase()+last.substring(1,last.length()).toLowerCase();
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        //trim and replace methods helps to remove spaces ex:replace(target:" ", replacement:"")
        //after input.nextLine.trim().replace()





    }
}
