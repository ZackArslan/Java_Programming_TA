package day09_scanner;
import java.util.Scanner;
public class ScannerIntro2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number");

        float num= input.nextFloat();

        System.out.println("Enter your second decimal number");

        double num2= input.nextDouble();
        //you can put integer number but you will get decimal number

        System.out.println("enter true or false");
        boolean r= input.nextBoolean();


        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);

        input.close();



















    }
}
