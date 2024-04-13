package day09_scanner;
import java.util.Scanner;
public class ScannerFirstTask {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("how many people do you live with?: ");

        int people = input.nextInt();
        if (people<3){
            System.out.println("live with less than 3 people");
        } else if (people>=3&&people<=6) {
            System.out.println("live with 3-6 people");
        } else{
            System.out.println("live with more than 6 people");
        }

        input.close();





        /*
         Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


         */










    }
}
