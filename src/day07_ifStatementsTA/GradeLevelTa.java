package day07_ifStatementsTA;

public class GradeLevelTa {
    public static void main(String[] args) {

        double gradeLevel = 6;

        String result = "";

        if(gradeLevel>=1&&gradeLevel<=5){
            result = "Elementary School";
        } else if (gradeLevel<=8) {    //gradeLevel>=6&& you can take it out couse 1st one must be false
            result = "Middle School";
        } else if (gradeLevel<=12) {
            result = " High School";
        } else if (gradeLevel<=16) {
          result = " College";
        }else{
          result = " Grad School";
        }

        System.out.println(result);


    }
}
