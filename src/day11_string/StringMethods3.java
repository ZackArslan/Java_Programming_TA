package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {

        //-----------------isEmpty
        String word = "";
        boolean r1= word.isEmpty();
        System.out.println(r1);

        //------------------------isBlank

        String str= "       ";

        boolean r2= str.isEmpty(); //false
        boolean r3 = str.isBlank(); //true , blank see spaces

        System.out.println(r2);
        System.out.println(r3);

        //----------------------Equals

        String str1= "Cydeo";

        String str2= new String("Cydeo");

        System.out.println(str1.equals(str2));

        String str3 = new String("cydeo");
        System.out.println(str1.equals(str3));

        //----------------------------

        String s1= "JAVA";
        String s2= "java";
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        //----------------------contains

        String students= "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed= students.contains("Ahmed"); //false
        System.out.println(hasAhmed);
        //---------

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava= sentence.toLowerCase().contains("java"); // for lower case add tolowercase method
        System.out.println(hasJava);

        //------------------------StartsWith

        String name= "Michael";

        boolean l= name.startsWith("Da"); //false
        System.out.println(l);

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid); //true

        boolean t= url.endsWith(".com");
        System.out.println(t);//true

        //-----------------------------------

        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("@gmail.com");
        System.out.println(isGmail); //true
        boolean isYahoo = email.endsWith("@yahoo.com");
        System.out.println(isYahoo);//false
















    }
}
