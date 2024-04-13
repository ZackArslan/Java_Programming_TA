package day11_string;
import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String userName = input.nextLine();
        System.out.println("Enter your password:");
        String password = input.nextLine();

        if(userName.equals("Cydeo")&& password.equals("WoodenSpoon")){
            System.out.println("You are now logged in");
        }else{
            System.err.println("Incorrect username or password.Please try again.");
        }
//err make it red color
        input.close();









    }
}
