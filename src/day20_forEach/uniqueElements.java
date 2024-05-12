package day20_forEach;

public class uniqueElements {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,1,2,3,5,6,7};

        for (int each1 : numbers) {   //{1,2,3,4,1,2,3,5,6,7}
            int count = 0;
            for (int each2 : numbers) {  //{0,0,0,0,0,0,0,0}
                if (each1 == each2) {      //if 1 2 3 4 1 2 3 equals then add to count
                    count++;   //{1,2,3}
                }
            }
            if (count == 1) {
                System.out.println(each1);
            }
        }
        /*
        Write a program that can display the unique elements of an array

			MUST use for each loops


         */
    }
}
