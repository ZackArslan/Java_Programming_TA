package day09_scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int month = 12;
        String result ="";

        switch (month){
            case 2:
                result="has 28 days";
                break;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               result = "has 31 days";
               break;

            case 4: case 6: case 9: case 11:
                result="has 30 days";
                break;

            default:
                result="invalid";

        }
        System.out.println(result);



















    }
}
