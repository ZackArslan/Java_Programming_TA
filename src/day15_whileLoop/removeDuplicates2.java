package day15_whileLoop;

public class removeDuplicates2 {
    public static void main(String[] args) {

        String str="xyzxyzxyz";

        String result="";

        for (int i = 0; i < str.length(); i++) {

            if(result.contains(""+str.charAt(i))){  //if character already contain then we skip it
                continue;
            }
            result+=str.charAt(i);

        }
        System.out.println(result);

        System.out.println("---------------------");

        // find the sum of all even numbers between 50 - 100

        for (int i = 50; i < 101 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();  //making a new line we added empty print

        for (int i = 50; i < 101; i++) {
            if(i%2!=0){  //if i: is an odd number
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();  //making a new line we added empty print

        for (int i = 50; i < 101 ; i+=2) {  //increase by 2 50,52,54,56......
            System.out.print(i+" ");
        }

        //those are 3 different solutions for finding all even numbers 50-100
        //first one if i%2==0 then print i+" "
        //second one if i%2!= (if its odd number) then continue (skip)
        //third one change the last variable ex: i+=2 then print i+" " only






        //write a program that can remove the duplicated characters from a string

        //ex: str= "aabbbcccc"     output: abc
    }
}
