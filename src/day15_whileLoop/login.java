package day15_whileLoop;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.println("Enter your user name:");
            String user = input.next();

            System.out.println("Enter your password:");
            String password = input.next();


            if (user.equals("Cydeo") && password.equals("Cydeo123")) {  // if the credentials are correct
                System.out.println("Logged in");
            } else { // otherwise

                for (int i = 0; i < 2; i++) { //i : 0, 1, 2

                    System.err.println("Incorrect username or password, please re-enter");

                    System.out.println("Enter your username:");
                    user = input.next();

                    System.out.println("Enter your password:");
                    password = input.next();

                    if (user.equals("Cydeo") && password.equals("Cydeo123")) { //if the user enters valid credentials
                        System.out.println("You are now logged in");
                        break; // exits the loop
                    }

                }

                if (!(user.equals("Cydeo") && password.equals("Cydeo123"))) { // after all three attempts, if the username & password are still incorrect
                    System.err.println("Your account now is locked, please contact with the support team");
                }


            }


            input.close();
        }
    }





        /*
        you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
          three attempts to enter correct credentials and if all three attempts are failed,
          then print "Your account is lucked."

         */


