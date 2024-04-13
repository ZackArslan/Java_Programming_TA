package day12_CustomMethods;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        eligibleToBuyAlcohol(21);
    }
    public static void eligibleToBuyAlcohol(int age){

        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }

    }
}
