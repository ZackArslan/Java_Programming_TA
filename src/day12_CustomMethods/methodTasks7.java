package day12_CustomMethods;

public class methodTasks7 {
    public static void main(String[] args) {

        salary(45,40);
    }
    public static void salary(double hourlyRate,int weeklyHours){

        System.out.println("You make"+" "+hourlyRate+" "+"per hour");
        System.out.println("You work"+" "+weeklyHours+" "+"in a week");
        System.out.println("Your gross income is"+" "+hourlyRate*weeklyHours*52);

    }
}
