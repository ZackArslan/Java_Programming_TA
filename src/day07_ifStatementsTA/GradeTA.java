package day07_ifStatementsTA;

public class GradeTA {
    public static void main(String[] args) {

        char grade = 'B';

        String result = "";

        if(grade == 'A'){
            result = " Excellent";
        }
        if(grade == 'B'){
            result = "Great job";
        }
        if(grade == 'C'){
            result = "Good";
        }
        if(grade == 'D'){
            result = "Passed";
        }
        if(grade == 'E'){
            result = "Failed";
        }
        System.out.println(result);







    }




}
