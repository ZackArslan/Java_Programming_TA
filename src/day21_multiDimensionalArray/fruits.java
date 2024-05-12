package day21_multiDimensionalArray;

import java.util.Arrays;

public class fruits {
    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (String[] each1D : items) {
            for (String eachFruit : each1D) {
                System.out.print(eachFruit+"\t");
            }
        }
        System.out.println();
        System.out.println("------------------------reverse");


        for (String[] each1D : items) {
            for (int i = each1D.length - 1; i >= 0; i--) {
               String each =each1D[i];
                System.out.print(each+"\t");
            }
        }
        System.out.println();

        System.out.println("------------------------reverse");

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
       /* for (int i = items.length - 1; i >= 0; i--) {
            String[] each=items[i];
            System.out.println(Arrays.toString(each)+"\t");
            }

        */


        /*  given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
         */
    }
}
