package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int total =input.nextInt();

        int[] numbers=new int[total];

        int sum=0;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number");
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }
        double average= sum/(double)total;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum "+sum);
        System.out.println("average = " + average);
    }
}
