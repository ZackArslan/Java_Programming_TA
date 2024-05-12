package day17_customClass;

public class uniqueCharacter2 {
    public static void main(String[] args) {

        String str="aabcccd";

        String unique="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            int frequency=0;

            for (int j = 0; j < str.length(); j++) { //checks how many times each has appeared in str
                if(each==str.charAt(j)){    //if the each has appeared in the string
                    frequency++; //increase the frequency by 1
                }
            }
            if(frequency==1){  //if the frequency is one then its unique
                unique+=each;
            }
        }
        System.out.println(unique);





        //different solution

        /*
        Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
         */
    }
}
