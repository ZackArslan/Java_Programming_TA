package day15_whileLoop;

public class continueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6 ; i++) {

           if(i==4){
               continue;   //it means skip the i== value // 123 5 skipped the 4
           }

            System.out.println(i);
        }

        System.out.println("---------------------");

        for (int i = 10; i < 21; i++) {

            if(i%2==0){    //if i: is even number it skips those numbers
                continue;
            }

            System.out.println(i);
        }

        System.out.println("---------------");

        for (char i = 'A'; i <='G'; i++) {

            if(i=='B'|| i=='C'){
                continue;           //we can use || logical we dont have to make 2 different if
            }
            if(i=='E'){
                continue;    //we cant use && and logical because char cant be more than 1 character
            }

            System.out.println(i);
        }

        System.out.println("------------------");

        for (int i = 0; i < 10; i++)
            System.out.println("Hello World");
        //without curly braces only run 1 statement 10 times when you add another statement will run 1 time



    }
}
