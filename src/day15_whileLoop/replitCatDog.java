package day15_whileLoop;

import java.util.Scanner;

public class replitCatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int cat=0;
        int dog=0;
        for (int i = 0; i < str.length()-2; i++) {
            String part=str.substring(i,i+3);
            if(part.equals("cat")){
                cat++;
            }else if (part.equals("dog")){
                dog++;
            }



        }
        System.out.println(cat==dog);
    }
}
