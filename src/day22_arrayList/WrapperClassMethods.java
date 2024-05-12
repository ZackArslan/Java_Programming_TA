package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        // parse method: returns primitive type, converts String to primitive values //

        String str = "20";

        System.out.println(str +1 );

        Integer num1= Integer.parseInt(str); // this is how we can convert String value to Integer
        // unboxing is one more step in parse method we can directly assign to int value

        int num = Integer.parseInt(str);

        System.out.println(num+1); // value will be 21


        //valueOf method: returns wrapepr class objects, converts String to wrapper class values//


        Integer num2 =   Integer.valueOf(str); // it will return wrapper object

        System.out.println(num2);


        System.out.println("-----------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s); // you need to convert it parse with wrapper class that you want to use

        Double  num4  = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);


        System.out.println("--------------------------");

        String x = " true";

        boolean r1 =Boolean.parseBoolean(x); // parse is case sensitive

        Boolean r2 = Boolean.valueOf(x); // valueof is not case sensitive


        System.out.println("--------------------------");


        // Character class some unique rules


        // ------------------ isDigit()--------------//
        char ch = 'A';

        boolean q1 = Character.isDigit(ch); // this will check given character if it is digit or not . and you dont have to look on aski table

        System.out.println("is Digit ="  + q1);

        // ----------------isLetter()----------------//

        boolean y1 = Character.isLetter(ch); // this will return you is it letter or not

        System.out.println("is Letter = " +y1);


        // ----------------isLowerCase()----------------//

        boolean isLowerCase = Character.isLowerCase(ch); // this will return you is it lowercase or upper case

        System.out.println("is lowerCase =" +isLowerCase);


        // ----------------isUpperCase()----------------//

        boolean isUpperCase = Character.isUpperCase(ch); // this will return you is it uppercase ?

        System.out.println("Is uppercase ="+ isUpperCase);


        // ----------------isLetterOrDigit()----------------//
        // it means special


        boolean isSpecialCharacter  = !Character.isLetterOrDigit(ch); // this will check if the given value letter or digit and if you want to check if it special character use ! mark


        System.out.println("isSpecialCharacter = " + isSpecialCharacter);


        System.out.println("---------------------------------");


        // how we can find sum of numbers given string
        String str1  = " a1b2c3d4e5f";


        int sum = 0; // in order to start solution you need to create sum which will contain digit from given string

        for (char eachCharacter : str1.toCharArray()) { // and then we need to create for each loop , but foreach loop assigned the array
            //so you can simply call toCharArray method to convert it to array
            // and you need to assign each value of given string to each Character

            if (Character.isDigit(eachCharacter)){ // after that you have to create a if condition to check if given strings contains digit
                sum +=  Integer.parseInt(eachCharacter+""); // if it contains , by using wrapperClass Integer.ParseInt method to assign it sum value
                //but there is key point each Character is char value but parse int method string by using concatenation you can simply assign it
            }
        }
        System.out.println(sum);



    }
}
