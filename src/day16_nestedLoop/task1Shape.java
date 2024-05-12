package day16_nestedLoop;

import java.sql.PreparedStatement;

public class task1Shape {
    public static void main(String[] args) {

        char ch = '*';

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(ch + " ");

            }
            System.out.println();
        }
    }
}
