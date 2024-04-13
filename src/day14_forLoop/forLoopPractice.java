package day14_forLoop;

public class forLoopPractice {
    public static void main(String[] args) {

        for(int i =10; i>=5; i--){    //i: 10 ,9 ,8, 7 ,6,5
            System.out.println("Hello cydeo "+i); // 1 ,2 ,3,4,5,6   //6 times it print

        }

        System.out.println("-----------------------");

        //sum of all the numbers 1-100
        //print all the characters a-z
        //print all the alphabet letters in backwards

        int sum=0;

        for(int i =1; i<=100;i++){   ////sum of all the numbers 1-100
            sum += i;
        }
        System.out.println(sum);

        System.out.println("-------------------------");

        for( char i='A'; i<='Z';i++){      ////print all the characters a-z
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Hello");

        System.out.println("-------------------------------");

        for(char i= 'Z'; i>='A';i--){     ////print all the alphabet letters in backwards
            System.out.print(i+" ");
        }






    }
}
