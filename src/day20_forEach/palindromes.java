package day20_forEach;

public class palindromes {
    public static void main(String[] args) {

        String[] palindromes={"anna", "level", "Java","Tilbe"};

        int count=0;
        String word = "";

        for (String each : palindromes) {
            for (int i = each.length()-1; i >= 0; i--) {
                word += each.charAt(i);
            }
            if (each.equals(word))
                count++;
                word = ""; // reset word for the next iteration
        }
        System.out.println("count = " + count);

    }
        /*
        write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

         */
    }

