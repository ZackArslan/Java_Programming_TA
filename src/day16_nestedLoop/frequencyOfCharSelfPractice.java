package day16_nestedLoop;

public class frequencyOfCharSelfPractice {
    public static void main(String[] args) {

        String str = "aaaaaaabbbbbbccccdddd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                //char ch = str.charAt(j);
                if (each == str.charAt(j)) {
                    frequency++;
                }
            }
            if (result.contains(each + "")) {
                continue;
            }
            result += each;
            result += frequency;

        }
        System.out.println(result);

        System.out.println(frequency("xxxxyyyyykkkkttttzzzz"));

        System.out.println("-------------------");


        String str2="aaabbbbcccccddd";
        char easss='c';

        int count=0;

        for (int i = 0; i < str2.length(); i++) {

            if(str2.charAt(i)==easss){
                count++;

            }

        }
        System.out.println(count);
















    }

    public static String frequency(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (each == ch) {
                    frequency++;
                }
            }
                if (result.contains(each + "")) {
                    continue;
                }
                result += each;
                result += frequency;

        }
        return result;

    }




}
