package day12_CustomMethods;

public class methodTasks3 {
    /*
    Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)
        output:
            June
     */
    public static void main(String[] args) {
        monthName(12);
    }
    public static void monthName(int month){

        if(month<1||month>12){
            System.out.println("invalid number");
        }

        switch (month){
            case 1:
                System.out.println("january"); break;
            case 2:
                System.out.println("february"); break;
            case 3:
                System.out.println("March");  break;
            case 4:
                System.out.println("april");  break;
            case 5:
                System.out.println("may"); break;
            case 6:
                System.out.println("june"); break;
            case 7:
                System.out.println("july"); break;
            case 8:
                System.out.println("august"); break;
            case 9:
                System.out.println("september"); break;
            case 10:
                System.out.println("october"); break;
            case 11:
                System.out.println("november"); break;
            case 12:
                System.out.println("december"); break;
            default:
        }


    }
}
