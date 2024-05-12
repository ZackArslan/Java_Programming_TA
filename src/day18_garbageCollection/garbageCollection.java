package day18_garbageCollection;

public class garbageCollection {
    public static void main(String[] args) {

        String s1="Java";
        s1=null;
        System.out.println(s1); //null  it went to garbage collection

        System.out.println("---------------------");

         String str1= "Pyhton";  // garbage collection
         str1="Java";

        System.out.println(str1);

    }
}
