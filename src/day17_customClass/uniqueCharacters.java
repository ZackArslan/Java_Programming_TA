package day17_customClass;

public class uniqueCharacters {
    public static void main(String[] args) {

        String str= "aabccd";

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);

                if(str.indexOf(each)==str.lastIndexOf(each)){
                    result+=each;
                }

        }
        System.out.println(result);
       /* for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch=str.charAt(j);
                if(!(str.charAt(i)==str.charAt(j))) {
                    result+=each;
                    if(str.contains(each+"")){
                        continue;
                    }
                }

        */

        /*
        Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
         */
    }
}
