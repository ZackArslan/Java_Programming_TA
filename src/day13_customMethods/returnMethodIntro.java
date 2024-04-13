package day13_customMethods;

public class returnMethodIntro {
    public static void main(String[] args) {

       // int total=sum(20,40); // sum is a void method,does not return any data

        int total =addition(10,20); //you can store into the variable because of return method

        int t= square(10);
    }

   /* public static void sum(int n1,int n2){

        int result = n1+n2;
        System.out.println(result);
    }
    */
    public static int addition(int n1,int n2){
        int result = n1+n2;
        return result; //you can also pass variable ex: int result=n1+n2

    }
    public static int square(int num){
        int square= num*num;
        return square;
    }
}
