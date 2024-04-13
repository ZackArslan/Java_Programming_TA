package day12_CustomMethods;

public class methodTasks4 {
    public static void main(String[] args) {

        days(7);

    }
    public static void days(int number){

        String day= number==1?"monday":number==2?"tuesday":number==3?"wednesday":number==4?"thursday":
                number==5?"friday":number==6?"saturday":number==7?"sunday":"invalid number";

        System.out.println(day);


    }
}
