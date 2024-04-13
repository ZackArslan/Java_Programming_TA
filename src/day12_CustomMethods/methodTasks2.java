package day12_CustomMethods;

public class methodTasks2 {
    public static void main(String[] args) {

        capitalization("tilBe","arslAn");


    }

    public static void capitalization(String firstName, String lastName){

          /*
        Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
         */

            String newFirstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
            String newLastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
            String fullName= newFirstName+" "+newLastName;
            System.out.println(fullName);




        }
}

