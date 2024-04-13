package day11_string;

public class calledEmailTask1 {
    public static void main(String[] args) {

        String email = "tilbe_arslan@gmail.com";

        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String end = email.substring(email.indexOf("@"));

        String result = lastName+"_"+firstName+end;

        System.out.println(result);


        /*
        Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
         */
    }
}
