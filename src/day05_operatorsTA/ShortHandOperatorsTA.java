package day05_operatorsTA;

public class ShortHandOperatorsTA {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a); // 20
        System.out.println(a); //20

        a = 40;
        System.out.println(a);

        a = 90;
        System.out.println(a);

        System.out.println("--------------------------------");

        //addition assignment operators

        double balance = 100;

        balance +=1000; //balance  = 100 + 1000 = 1100

        System.out.println("balance = " + balance);
         balance +=500; // balance = 1100+500 = 1600
        System.out.println("balance = " + balance);

        balance += 10000;
        System.out.println("balance = " + balance);

        //subtraction assignment operators

        balance -= 1000; // balance = 11600 - 1000 = 10600
        System.out.println("balance = " + balance);

        balance -=5000;
        System.out.println("balance = " + balance);

        System.out.println("----------------------------------");
        // multiplications

        double salary = 45000;
        salary *= 2;  // salary = 45000*2 = 90000
        System.out.println("salary = " + salary);

        salary *= 3;
        System.out.println("salary = " + salary);

        System.out.println("------------------------------------");

        double eth = 4;
        eth *= 250;
        System.out.println("eth = " + eth);

        eth /= 2;
        System.out.println("eth = " + eth);

        salary /= 2;
        System.out.println("salary = " + salary);
        System.out.println("----------------------------------------");

        //remainder assignment

        int b = 39;
        b %= 7; // b= 39%7
        System.out.println("b = " + b);












    }











}
