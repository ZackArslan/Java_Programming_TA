package day22_arrayList;

public class upperLowerEqual {
    public static void main(String[] args) {

        String str= "JAVA javaa";

        int upperCaseCounter = 0, lowerCaseCounter = 0;

        for (char each:str.toCharArray()) {
            if(Character.isUpperCase(each)){
                upperCaseCounter++;
            } else if (Character.isLowerCase(each)) {
                lowerCaseCounter++;
            }
        }
        if(upperCaseCounter==lowerCaseCounter){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        /*
        Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
         */
    }
}
