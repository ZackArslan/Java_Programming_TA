package day16_nestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String userName,password;
        int attempt=3;

        do{
            System.out.println("Enter your user name:");
            userName=input.next();

            System.out.println("Enter your password:");
            password= input.next();
            attempt--;
            if(attempt==0){
                break;
            }

        }while (!(userName.equals("Cydeo")&&password.equals("Cydeo123")));//while answers invalid continue asking


    }
}
