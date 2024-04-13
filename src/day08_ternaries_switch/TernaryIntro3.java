package day08_ternaries_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int score = 60;

        /*String result = "";
        if(score>=0&&score<=100){
            if (score >= 60) {
                result = "passed";
            } else {
                result = "failed";
            }
        }else{
            result = "invalid score";
        }

        System.out.println(result);

         */

        String result2 = (score>=0&&score<=100)?(score>=60)?"Passed":"failed":"invalid";

        System.out.println(result2);

        System.out.println("--------------------");

        int n = 8;

        String day = (n>=1&&n<=7)?(n==1)?"Monday":(n==2)?"tuesday":(n==3)?"wednesday"
                :(n==4)?"thursday":(n==5)?"friday":(n==6)?"saturday":"sunday":"invalid";

        System.out.println(day);











    }
}
