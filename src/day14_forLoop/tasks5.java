package day14_forLoop;

public class tasks5 {
    public static void main(String[] args) {

        String str="ABcde123@#$";
        String digit="";
        String character="";
        String letter="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letter += ch;
            } else if (ch >= '0' && ch <= '9') {
                digit += ch;
            } else {
                character += ch;
            }

        }
        System.out.println("Letters: " + letter);
        System.out.println("Digits: " + digit);
        System.out.println("Special characters: " + character);
        /*
        write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */
    }
}
