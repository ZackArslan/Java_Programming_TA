package day12_CustomMethods;

import java.util.Scanner;

public class replitPosNegOrZero {
    public static void main(String[] args) {

        sign();
    }
    public static void sign(){

        Scanner in= new Scanner(System.in);
        int n=in.nextInt();

        if(n>0){
            System.out.println("positive");
        } else if (n<0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }


    }
}
