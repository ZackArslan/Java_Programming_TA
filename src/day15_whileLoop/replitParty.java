package day15_whileLoop;

import java.util.Scanner;

public class replitParty {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String list="";

        System.out.println("Please enter the guest name");
        String guestName=input.next();
        list+=guestName+" ";
        System.out.println("Would you like to add another guest?");
        String secondGuest= input.next().toLowerCase();

            while(secondGuest.equals("yes")) {
                System.out.println("Please enter the guest name");
                guestName = input.next();
                list += guestName+" ";
                System.out.println("Would you like to add another guest?");
                secondGuest = input.next().toLowerCase();
                if (secondGuest.equals("no")) {
                    System.out.println(list);
                }
            }

    }
}
