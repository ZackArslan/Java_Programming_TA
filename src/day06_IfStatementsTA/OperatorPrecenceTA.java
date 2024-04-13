package day06_IfStatementsTA;

public class OperatorPrecenceTA {
    public static void main(String[] args) {

        System.out.println(5 +2*3);
        System.out.println(7 + 3 - 2/2);
        System.out.println(-5 + 2);
        System.out.println(10>9 == 8<7 && "Java" == "python" || "a" == "A");

        System.out.println(100 >=20 && 40*2>60);
        //                 100 >= 20 && 80 >60
        //                 true      &&  true
        //                       true

        int a = 20;
        a+= 10 +2*3;
        // a +=10+6
        // a+=60
        // a= 36











    }




}
