package day07_ifStatementsTA;

public class GradeLevel {
    public static void main(String[] args) {

      int number =18;
      String result = "";

      if(number>=1&&number<=18){
       if(number>=1&&number<=5){
           result = "elementary school";
       } else if (number>=6&&number<=8) {
           result = "middle school";
       } else if (number>=9&&number<=12) {
           result= " high school";
       } else if (number>=13&&number<=16) {
           result = " college";
       }else {
           result="grad";
       }


      }else {
          result = "invalid";
      }

        System.out.println(result);








        /*
reate a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                             */









    }
}
