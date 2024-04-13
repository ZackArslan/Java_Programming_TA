package day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'Q';

        switch (grade){
            case'A':
                System.out.println("excellent");
                break;
            case'B':
                System.out.println("Great job");
                break;
            case'C':
                System.out.println("Good");
                break;
            case'D':
                System.out.println("passed");
                break;
            case'F':
                System.out.println("failed");
                break;

            default:
                System.out.println("invalid");
        }



        /*
        A Excellent
        B Great gob
        C good
        D passed
        F failed
         */










    }
}
