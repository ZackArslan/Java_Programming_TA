package day08_ternaries_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number = 100;


     //   String result= ""
        // if(number>0){
         //   result="positive";
       // } else if (number<0) {
         //   result="negative";
       // }else {
         //   result = "zero";
        //}

        String result = (number>0)? "positive":(number<0)?"negative":"zero";

        System.out.println(result);


        System.out.println("---------------------------------");

        int n = 1;

        /*String day = "";
        if(n==1){
            day= "monday";
        } else if (n==2) {
            day= "tuesday";
        } else if (n==3) {
            day="wednesday";
        } else if (n==4) {
            day="thursday";
        } else if (n==5) {
            day="friday";
        } else if (n==6) {
            day="saturday";
        }else {
            day="sunday";
        }
*/

        String day = (n==1)?"monday":(n==2)?"tuesday":(n==3)?"wednesday":(n==4)?"thursday"
                :(n==5)?"Friday":(n==6)?"Saturday":"sunday";

        System.out.println(day);
        System.out.println("------------------");

        int num= 12;

        String month = (num==1)?"january":(num==2)?"february":(num==3)?"march"
                :(num==4)?"april":(num==5)?"may":(num==6)?"june":(num==7)?"july"
                :(num==8)?"august":(num==9)?"september":(num==10)?"october":(num==11)?"november"
                :"december";
        System.out.println(month);








    }
}
