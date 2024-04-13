package day06_IfStatementsTA;

public class GradeLevel2TA {
    public static void main(String[] args) {

        int gradeLevel = 10;
        String result = ""; //temporary value

        if(gradeLevel>=1 && gradeLevel<=5){
            result ="elementary School";
        }
        if(gradeLevel>=6 && gradeLevel<=8){
            result ="middle school";
        }
        if(gradeLevel>=9 && gradeLevel <=12){
            result ="high school";
        }
        if(gradeLevel>=13 && gradeLevel <=16){
            result = "college";
        }
        if(gradeLevel>=17 && gradeLevel <=18){
            result = "grad school";
        }
        System.out.println(result);









    }
}
