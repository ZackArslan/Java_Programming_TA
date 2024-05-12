package day19_array;
import java.util.Arrays;
public class arrayIntro {
    public static void main(String[] args) {

        int[] scores= new int[5];  //5 here is length that means index num 0 to 4

        scores[0]= 78;
        scores[1]= 80;
        scores[2]= 85;
        scores[3]= 90;
        scores[4]= 95;

        //we cant add more than index number 4 because we assign till 5

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("------------------------------");

        for (int i = 0; i < scores.length; i++) {   //i: index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("-----------------");

        System.out.println(scores[scores.length-1]);  // finding last index number




    }
}
