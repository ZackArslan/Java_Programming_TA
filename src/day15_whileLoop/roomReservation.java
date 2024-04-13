package day15_whileLoop;

import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to reserve a room? Enter yes/no");
        String reservation = sc.nextLine().toLowerCase();
        String roomType;
        int cost = 0;
        while (!(reservation.equals("yes")||reservation.equals("no"))) {
            System.err.println("Would you like to reserve a room? Enter yes/no");
            reservation = sc.nextLine().toLowerCase();
        }
            if(reservation.equals("yes")){
                System.out.println("Which room type\nKing Bed ==> 120$\nQueen Bed ==> 100$\nsingle Bed ==> 80$");
                roomType = sc.nextLine().toLowerCase();
                while(!(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single"))){
                    System.err.println("Invalid room type");
                    System.out.println("Which room type\nKing Bed ==> 120$\nQueen Bed ==> 100$\nsingle Bed ==> 80$");
                    roomType = sc.nextLine().toLowerCase();
                }
                if(roomType.equals("king")){
                    cost+=120;
                    System.out.println("Your room type: "+roomType+"\nRoom Fee: "+cost);
                } else if (roomType.equals("queen")) {
                    cost+=100;
                    System.out.println("Your room type: "+roomType+"\nRoom Fee: "+cost);
                }else if(roomType.equals("single")){
                    cost+=80;
                    System.out.println("Your room type: "+roomType+"\nRoom Fee: "+cost);
                }
            }else if (reservation.equals("no")){
                System.out.println("Have a nice day");
            }

        }



        /*
        Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

         */
    }


