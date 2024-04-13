package day09_scanner;
import java.util.Scanner;
public class GradeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");

        int grade = input.nextInt();
        String result = "";
        if(grade>=0&&grade<=100){
            if(grade >= 80 && grade <= 100){
                result ="A";
            }else if (grade >= 60 && grade <= 80){
                result="B";
            }else if (grade >= 40 && grade <= 60){
                result = "C";
            } else if (grade >= 20 && grade <= 40) {
                result="D";
            }else {
                result="F";
            }

        }else {
            System.out.println("invalid");
        }
        System.out.println(result);

        input.close();

        /*
        create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score


         */












    }
}
