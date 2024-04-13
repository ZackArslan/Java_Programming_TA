package day05_operatorsTA;public class LogicalOperatorsTA {
    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;
        int age = 42;

        boolean eligibleForLoan = salary>= 30000 && creditScore >=650 && age>=18;
        System.out.println(eligibleForLoan);

        age = 18;
        String country = "japan";
        boolean eligibleToVote = age>=18 && country == "USA";
        System.out.println(eligibleToVote);

        // || logical or (either)
        String answer = "no";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);

        //one of them true then its true
        //whenever both false then its false only

        char grade = 'B';
        boolean passed = grade == 'A'|| grade == 'B'|| grade == 'C'|| grade == 'D';
        System.out.println(passed);

        // ! logical not operator false/true true/false

        System.out.println(!true);

        String a = "yes";
        boolean yes = a=="yes"; //true
        boolean no = !yes; //false
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);










    }










}
