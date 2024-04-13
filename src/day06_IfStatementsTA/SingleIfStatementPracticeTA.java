package day06_IfStatementsTA;

public class SingleIfStatementPracticeTA {
    public static void main(String[] args) {

        int number = 155;
        boolean isEven = number %2==0;
        if(isEven){
            System.out.println("even number");
        }
        if(!isEven){
            System.out.println("Odd number");
        }
        System.out.println("-----------------");

        if(number %2==0){
            System.out.println("even number");
        }
        if(number%2!=0){
            System.out.println("odd number");
        }











    }













}
