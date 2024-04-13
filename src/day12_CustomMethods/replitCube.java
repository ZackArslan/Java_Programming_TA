package day12_CustomMethods;

import java.util.Scanner;

public class replitCube {
    public static void main(String[] args) {

        cube();

    }
    public static void cube(){

        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        n= n*n*n;
        System.out.println(n);

    }
}
