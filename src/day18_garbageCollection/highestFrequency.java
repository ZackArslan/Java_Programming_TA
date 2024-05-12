package day18_garbageCollection;

public class highestFrequency {
    public static void main(String[] args) {

        String str = "aaabbccccddeeee";
        String result = "";

        int maxCount=0;

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=1;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
                if(count>maxCount){
                    maxCount=count;
                    result=ch+"\n";
                }else if(count==maxCount){
                    result+=ch;
                }
            }
        System.out.println(result);
        }

       /* for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            int count=1;

            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j)==ch){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount=count;
                result=ch+"\n";
            } else if (count==maxCount) {
                result+=ch;
            }
        }
        System.out.println(result);

        */

        /*
        Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
         */
    }


