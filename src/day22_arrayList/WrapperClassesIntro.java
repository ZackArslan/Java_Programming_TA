package day22_arrayList;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        String str = "";

        int a1 = 10; // primitives

        Integer a2 = 10; // object of int


        System.out.println("------------------------------------------");


        int b1 = 100; // we need to convert to wrapper class object and we can only convert it to int

        double c1 = b1; // implicit casting will be on primitive data

        long c2 = b1; //  implicit casting will be on primitive data


        Integer b2 = b1; // Autoboxing process and which primitive type you use, you have to convert it to right wrapper class

        // long b3 = b1 --> however you can not do it on wrapper class


        char ch = 'A';

        Character ch2 = ch; //autoboxing

        double d1 = 5.5;

        Double d2 =d1 ; // autoboxing

        System.out.println("------------------------------------------");


        Integer n1 = 20; // wrapper Class

        int n2 = n1; // unboxing class
        long n3 = n1; // we could unbox integer value to bigger primitive data type
        double n4 = n1 ;



        Character e1 = 'Z';


        char e2=e1;
    }

}
