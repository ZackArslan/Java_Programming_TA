package day15_whileLoop;

public class removeDuplicates {
    public static void main(String[] args) {

        String str="aabbbcccc";

        String result =""; //"abc"

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str
            char each=str.charAt(i); // each character of the String str

            if(!result.contains(""+each)){ //if string result does not contain the character of string str yet
                result+=each;  //then we will add the character to string result
            }
        }
        System.out.println(result);



        //write a program that can remove the duplicated characters from a string

        //ex: str= "aabbbcccc"     output: abc
    }
}
