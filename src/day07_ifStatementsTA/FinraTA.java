package day07_ifStatementsTA;

public class FinraTA {
    public static void main(String[] args) {

        int number = 50;
        String result = "";
        if(number%3==0|| number%5==0|| number%3==0 && number%5==0) {
                if(number%3==0 && number%5==0){
                    result= "FINRA";
                }else if (number%5==0){
                    result = "RA";
                }else{
                    result = "FIN";
                }
        }else{
            System.out.println(number);
        }
        System.out.println(result);





        /*
        reate a class called FINRA,
         Write a function which prints out the number.
         but for number which is a multiple of 3, print "FIN" instead of the number and
         for number which is a multiple of 5, print "RA" instead of the number.
         and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
         */








    }




}
