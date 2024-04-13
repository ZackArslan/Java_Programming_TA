package day07_ifStatementsTA;

public class Grade2TA {
    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        if(grade=='A'){
            result = "Excellent";
        } else if (grade =='B') {
            result = " Great job";
        } else if (grade == 'C') {
            result = "good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);


    }
}
