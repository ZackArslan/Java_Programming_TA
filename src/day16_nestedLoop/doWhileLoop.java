package day16_nestedLoop;

public class doWhileLoop {
    public static void main(String[] args) {

        boolean condition=false;
        for (; condition; ) {
            System.out.println("hello cydeo--for loop"); //dont get executed because boolean false

        }
        System.out.println("-------------------");

        while(condition){
            System.out.println("hello cydeo---while loop");
        }
        System.out.println("-------------------");

        do{
            System.out.println("hello cydeo----do while loop");
        }while (condition);


    }
}
