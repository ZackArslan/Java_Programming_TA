package day15_whileLoop;

import java.util.Scanner;

public class replitZombie {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Population");
        int population = input.nextInt();

        for (int day = 0; population>0; day++) {
            System.out.println("Day "+day+"["+population+"]");

            population=population/2;
            // population/=2



        }

    }
}
