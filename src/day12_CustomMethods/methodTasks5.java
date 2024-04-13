package day12_CustomMethods;

public class methodTasks5 {
    public static void main(String[] args) {

        monthHasDay("june");

    }
    public static void monthHasDay(String month){

        month = month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();

        String result = month;

        switch (month) {
            case "February":
                month += " has"+ 28 + " days";
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                month += " has"+30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                month += "has"+31 + " days";
                break;

            default:
                month = "Invalid month";
        }

        System.out.println(month);

       /* switch (month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println(month+" has 31 days");
                break;
            case "february":
                System.out.println(month+" has 28 days");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println(month+" has 30 days");
                break;
            default:

        */


        }
    }

