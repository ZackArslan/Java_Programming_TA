package day09_scanner;
import java.util.Scanner;
public class SpeedTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your current speed");
        int Speed = input.nextInt();
        int SpeedLimit = 55;
        if (Speed > SpeedLimit && Speed >= 0) {
            int Difference = Speed - SpeedLimit;
            System.out.println("You're driving " + Difference + " mph over the limit. Slow down!");
        } else if (Speed == SpeedLimit) {
            System.out.println("You're driving " + SpeedLimit + " mph According to  the limits. Good Driver");
        } else {
            System.out.println("You're driving under the speed limit . Speed up!");
        }

        /*
        Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down
         */


        }
    }
