package day09_scanner;
import java.util.Scanner;
public class NextLineMethodPractice {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter your full name");

        String full_name= input.nextLine();

        System.out.println("enter your school name: ");

        String school_name= input.nextLine();

        System.out.println("Enter your gender");

        String gender = input.next();


        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("enter the street name: ");

        String street= input.nextLine();
        // if you use nextLine method after other methods you need provide extra nextline method




















    }
}
