package day16_nestedLoop;

public class nestedLoopPractice {
    public static void main(String[] args) {

        String str="aaabbccccddeeeeff";

        String result="";  // "bdf" repeat twice



        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j); //each character of str
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            if(count==2&&!result.contains(ch+"")){
                result+=ch;
            }
        }
        System.out.println(result);






    }
}
