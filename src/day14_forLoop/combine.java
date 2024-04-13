package day14_forLoop;

public class combine {
    public static void main(String[] args) {
        System.out.println(combine("one", "eight"));
    }
    public static String combine(String str1,String str2){
        if(str1.substring(str1.length()-1).equals(str2.substring(0,1))){
            return str1.substring(0,str1.length()-1)+str2;
        }else {
            return str1+str2;
        }

    }
}
