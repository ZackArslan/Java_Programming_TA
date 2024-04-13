package day12_CustomMethods;

public class methodTasks6 {
    public static void main(String[] args) {

        eligibleToVote(19,false);

    }
    public static void eligibleToVote(int age,boolean isAmerican){

        if(age>=18&&isAmerican==true){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }

    }
}
