package day17_customClass;

public class frequencyOfChar {
    public static void main(String[] args) {

        String str="aabcccd";
        String result="";

        for (int i = 0; i < str.length(); i++) {
           //char each=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
                if(result.contains(str.charAt(i)+"")){
                    continue;
                }
                result+=str.charAt(i)+""+count;


        }
        System.out.println(result);
        /*
        Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
         */
    }
}
