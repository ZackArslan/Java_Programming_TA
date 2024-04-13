package day15_whileLoop;

public class breakStatement {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {

            if(i==6){  //if i value reach 6
                break;   // exist the loop
            }

            System.out.println(i);

        }

        System.out.println("--------------------");

        for (char i = 'A'; i < 'Z'; i++) {
            System.out.println(i);   //if you put print statement before the if it prints 'M' also
            if(i=='M'){
                break;        //but if you place it after if then it will not print 'M'
            }


        }
        System.out.println("---------------");

        for(;;){
            System.out.println("hello");
            break;    //infinity loop will stop
        }

    }
}
