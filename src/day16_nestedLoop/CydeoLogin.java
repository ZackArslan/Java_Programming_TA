package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your user name:");
        String userName= input.next();
        System.out.println("Enter your password:");
        String password= input.next();

        if(userName.equals("Cydeo")&&password.equals("Cydeo123")){
            System.out.println("You have logged in");
        }else{
            for (int i = 0; i < 3; i++) {
                System.err.println("Incorrect user name or password,please re-enter:");
                System.out.println("Enter your user name:");
                userName= input.next();
                System.out.println("Enter your password:");
                password= input.next();

                if(userName.equals("Cydeo")&&password.equals("Cydeo123")){ //if user enters correct answer then break the loop
                    System.out.println("You have logged in");
                    break;
                }
                }
            if(!(userName.equals("Cydeo")&&password.equals("Cydeo123"))){
                System.err.println("Your account has lucked");  //after 3 attempts if still incorrect
            }
        }
        input.close();
    }
}
