package day05_operatorsTA;

public class RelationalOperatorsTA {
    public static void main(String[] args) {

        int a = 1000;
        int b = 200;
     //   System.out.println(a>b);
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);

        System.out.println("-----------------------");
        //greater than or equal

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed);

        int age = 21;
        boolean aligibleToBuyAlcohol = age >= 21;
        System.out.println(aligibleToBuyAlcohol);

        boolean eligibleToVote =age >=18;
        System.out.println(eligibleToVote);

        System.out.println(100>100); // false
        System.out.println(100>=100); // true
        System.out.println(100>=185); // false

        System.out.println("---------------------");

        score = 48;
        boolean failed = score <= 60;
        System.out.println(failed);
        System.out.println(100<=200); // true
        System.out.println(100<=20); //false

        System.out.println(95<=100); //true
        System.out.println(100<=100); // true
        System.out.println(10<=5);//false
        System.out.println("--------------------");

        System.out.println('a'> 'b');
        //                  65> 66 // false
        //you can use character because "char" has numbers















    }










}
