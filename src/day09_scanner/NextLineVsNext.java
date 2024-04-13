package day09_scanner;
import java.util.Scanner;
public class NextLineVsNext {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter you age");

        int age= input.nextInt(); //45

        input.nextLine(); //enter

        System.out.println("enter your full name");

        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);















    }
}
