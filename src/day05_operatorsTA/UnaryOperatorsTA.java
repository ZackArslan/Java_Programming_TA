package day05_operatorsTA;

public class UnaryOperatorsTA {
    public static void main(String[] args) {
        //pre increment/ decrement
        int x = 10;
        System.out.println(++x); // 11

        System.out.println(x); // 11

        int y = 100;

        System.out.println(--y); //99
        System.out.println(y);

        System.out.println("-------------------------------");

        // Post increment/ decrement
        int a =50;
        System.out.println(a++); //50
        System.out.println(a); //51

        int b = 25;
        System.out.println(b--); //25
        System.out.println(b); //24

        int n = 30;
        int m = n++; // m = 30 , n = 31
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z--; // q = 60 , z = 59
        System.out.println("q = " + q);
        System.out.println("z = " + z);









    }







}
