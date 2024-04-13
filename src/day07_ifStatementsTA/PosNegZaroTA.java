package day07_ifStatementsTA;

public class PosNegZaroTA {
    public static void main(String[] args) {

        int number = 20;
        String result = "";
        if(number>0){
            result = "positive";
        } else if (number<0) {
            result = "negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);


    }
}
