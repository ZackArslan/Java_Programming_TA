package day13_customMethods;

public class ReturnStatement {
    public static void main(String[] args) {

        eligible(25);

    }

    public static void eligible(int age){

        if(age<0 || age>150){
            System.err.println("invalid age"+age);
            return; //exist the method
        }
        //if age is invalid then this gets terminated
        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("not eligible to buy alcohol");
        }


    }
    public static int multiplication(int n1,int n2){
        int result = n1*n2;
        return result;
    }
}
