package day15_whileLoop;

public class uniqueCharacter {
    public static void main(String[] args) {

        String str="AABCCDeerrrrrt";
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if(str.indexOf(each)==str.lastIndexOf(each))
                str2+=each;
        }

        System.out.println(str2);


        /*
        Create a class called UniqueCharacters,
        Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
         */
    }
}
